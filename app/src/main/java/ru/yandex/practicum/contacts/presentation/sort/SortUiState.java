package ru.yandex.practicum.contacts.presentation.sort;

// класс UiState должен иметь package-private доступ
class SortUiState {

    private boolean isApplyEnable = false;
    private String newSelectedSortType = null;

    public boolean getIsApplyEnable() {
        return isApplyEnable;
    }

    public void setIsApplyEnable(boolean applyEnable) {
        isApplyEnable = applyEnable;
    }

    public String getNewSelectedSortType() {
        return newSelectedSortType;
    }

    public void setNewSelectedSortType(String sortType) {
        newSelectedSortType = sortType;
    }
}
