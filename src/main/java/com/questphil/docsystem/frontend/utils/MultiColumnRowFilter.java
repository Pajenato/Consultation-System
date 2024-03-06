/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.questphil.docsystem.frontend.utils;

import javax.swing.RowFilter;
import javax.swing.table.TableModel;
import java.util.Set;

public class MultiColumnRowFilter extends RowFilter<TableModel, Integer> {

    private final Set<Integer> columnIndicesToSearch;
    private final String searchText;

    public MultiColumnRowFilter(Set<Integer> columnIndicesToSearch, String searchText) {
        this.columnIndicesToSearch = columnIndicesToSearch;
        this.searchText = searchText.toLowerCase();
    }

    @Override
    public boolean include(Entry<? extends TableModel, ? extends Integer> entry) {
        String[] keywords = searchText.split("\\s+");
        for (String keyword : keywords) {
            boolean keywordMatch = false;
            for (int i = 0; i < entry.getValueCount(); i++) {
                if (columnIndicesToSearch.contains(i)) {
                    Object value = entry.getValue(i);
                    if (value != null && value.toString().toLowerCase().contains(keyword)) {
                        keywordMatch = true;
                        break;
                    }
                }
            }
            if (!keywordMatch) {
                return false;
            }
        }
        return true;
    }
}
