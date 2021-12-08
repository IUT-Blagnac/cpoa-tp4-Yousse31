package application;

import action.Action;
import action.ActionContext;
import action.ActionList;
import banque.AgenceBancaire;

import java.util.List;

public class ActionListAB implements ActionList {

    private String title;

    private List<Action<AgenceBancaire>> myMenu;

    private String dec;

    private String decTwice;

    private String numberOptSep;

    public ActionListAB(String m, String c, String t){

    }


    @Override
    public String listTitle() {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean addAction(Action ac) {
        return false;
    }

    @Override
    public boolean removeAction(Action ac) {
        return false;
    }

    @Override
    public Action getAction(int index) {
        return null;
    }

    @Override
    public String message() {
        return null;
    }

    @Override
    public String stringCode() {
        return null;
    }

    @Override
    public void execute(ActionContext ac) {

    }

    private int readResponse(){

        return 0;
    }

    private void printMenu(){

    }

    private void printTitle(AgenceBancaire ac){

    }

    private void tempo(){

    }
}
