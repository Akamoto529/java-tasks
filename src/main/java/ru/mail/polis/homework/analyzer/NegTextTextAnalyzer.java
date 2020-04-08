package ru.mail.polis.homework.analyzer;

import java.io.File;

public class NegTextTextAnalyzer implements TextAnalyzer {

    private String[] negWords = {"=(", ":(", ":|"};

    @Override
    public FilterType analyze(String str) {
        if (str == null) {
            return FilterType.GOOD;
        }
        for (String negWord :           //������ ������ ������ foreach ���������� IDEA. ���� ������ � ���� ������, ���� ��� ���������
                negWords) {
            if (str.contains(negWord)) {
                return getFilterType();
            }
        }
        return FilterType.GOOD;
    }

    @Override
    public FilterType getFilterType() {
        return FilterType.NEGATIVE_TEXT;
    }
}
