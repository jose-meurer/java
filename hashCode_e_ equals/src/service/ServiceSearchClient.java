package service;

import entities.IClient;

import java.util.List;

public class ServiceSearchClient {

    public static <T extends IClient> T searchClient(List<T> list, String search, Integer age, char searchChar) {
        for (int i = 0; i < list.size(); i++) {
            if (searchChar == 'n') {
                if (search.hashCode() == list.get(i).getName().hashCode()) {
                    if (search.equals(list.get(i).getName())) {
                        return list.get(i);
                    }
                }
            }
            if (searchChar == 'e') {
                if (search.hashCode() == list.get(i).getEmail().hashCode()) {
                    if (search.equals(list.get(i).getEmail())) {
                        return list.get(i);
                    }
                }
            }
            if (searchChar == 'i') {
                if (age.hashCode() == list.get(i).getAge().hashCode()) {
                    if (age.equals(list.get(i).getAge())) {
                        return list.get(i);
                    }
                }
            }
        }

        return null;
    }
}
