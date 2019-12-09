package com.pdftron.android.tutorial.customui.custom;

import android.content.Context;
import androidx.annotation.NonNull;

import com.pdftron.pdf.Annot;
import com.pdftron.pdf.controls.AnnotationToolbar;
import com.pdftron.pdf.controls.PdfViewCtrlTabFragment;
import com.pdftron.pdf.controls.PdfViewCtrlTabHostFragment;
import com.pdftron.pdf.model.AnnotStyle;
import com.pdftron.pdf.model.GroupedItem;

import static com.pdftron.pdf.controls.AnnotationToolbar.PREF_KEY_LINE;
import static com.pdftron.pdf.controls.AnnotationToolbar.PREF_KEY_NOTE;
import static com.pdftron.pdf.controls.AnnotationToolbar.PREF_KEY_RECT;
import static com.pdftron.pdf.controls.AnnotationToolbar.PREF_KEY_TEXT;

/**
 * Delegate class that adds a custom annotation toolbar to a PdfViewCtrlTabHostFragment. This sample
 * re-arranges items in the annotation toolbar grouping.
 */
public class CustomAnnotationToolbar extends CustomizationDelegate {

    public CustomAnnotationToolbar(@NonNull Context context, @NonNull PdfViewCtrlTabHostFragment tabHostFragment) {
        super(context, tabHostFragment);
    }

    @Override
    public void applyCustomization(@NonNull PdfViewCtrlTabFragment tabFragment) {
        customizeAnnotationToolbar(tabFragment);
    }

    private static void customizeAnnotationToolbar(@NonNull PdfViewCtrlTabFragment tabFragment) {
        // let's re-arrange items in the annotation toolbar grouping
        AnnotationToolbar annotationToolbar = tabFragment.getAnnotationToolbar();
        if (annotationToolbar == null) {
            tabFragment.createAnnotationToolbar();
            annotationToolbar = tabFragment.getAnnotationToolbar();
        }
        if (annotationToolbar != null) {
            annotationToolbar.getGroupItems().clear();
            annotationToolbar.getGroupItems().add(new GroupedItem(annotationToolbar, PREF_KEY_LINE, new int[]{Annot.e_Polyline, Annot.e_Line, AnnotStyle.CUSTOM_ANNOT_TYPE_ARROW, AnnotStyle.CUSTOM_ANNOT_TYPE_RULER, AnnotStyle.CUSTOM_ANNOT_TYPE_PERIMETER_MEASURE}));
            annotationToolbar.getGroupItems().add(new GroupedItem(annotationToolbar, PREF_KEY_RECT, new int[]{Annot.e_Circle, Annot.e_Square, Annot.e_Polygon, AnnotStyle.CUSTOM_ANNOT_TYPE_CLOUD, AnnotStyle.CUSTOM_ANNOT_TYPE_AREA_MEASURE}));
            annotationToolbar.getGroupItems().add(new GroupedItem(annotationToolbar, PREF_KEY_TEXT, new int[]{Annot.e_FreeText, AnnotStyle.CUSTOM_ANNOT_TYPE_CALLOUT}));
            annotationToolbar.getGroupItems().add(new GroupedItem(annotationToolbar, PREF_KEY_NOTE, new int[]{Annot.e_Sound, Annot.e_Text}));
        }
    }
}
