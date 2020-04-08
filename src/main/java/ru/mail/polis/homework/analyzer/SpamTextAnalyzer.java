package ru.mail.polis.homework.analyzer;

public class SpamTextAnalyzer implements TextAnalyzer {

    private String[] spam;

    SpamTextAnalyzer(String[] spam) {
        this.spam = spam;
    }

    @Override
    public FilterType analyze(String str) {
        if (str == null) {
            return FilterType.GOOD;
        }
        for (String spamWord :      //������ ������ ������ foreach ���������� IDEA. ���� ������ � ���� ������, ���� ��� ���������
                spam) {
            if (str.contains(spamWord)) {
                return getFilterType();
            }
        }
        return FilterType.GOOD;
    }

    @Override
    public FilterType getFilterType() {
        return FilterType.SPAM;
    }
}