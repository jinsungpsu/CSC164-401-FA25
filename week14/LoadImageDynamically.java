    @FXML
    void loadImageHandler(MouseEvent event) throws MalformedURLException {
        RestaurantItem selected = inventoryListView.getSelectionModel().getSelectedItem();
        String filepath = selected.getImagePath();
        File file = new File("images\\" + filepath); // image stored in project root/images/..."
        Image image = new Image(String.valueOf(file.toURI().toURL()));
        menuImageView.setImage(image);
    }
