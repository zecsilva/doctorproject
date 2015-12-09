package estilo.estrutura;

import estilo.recursos.*;
import estilo.util.*;
import java.util.*;

  class Jeops_RuleBase_OrdemDetalhamentoKB
extends jeops.AbstractRuleBase {
   
    /**
     * Identifiers of rule especificoparageral
     */
    private String[] identifiers_especificoparageral = {
        "estilos",
        "ordemDetalhamento"
    };

    /**
     * Returns the identifiers declared in rule especificoparageral
     *
     * @return the identifiers declared in rule especificoparageral
     */
    private String[] getDeclaredIdentifiers_especificoparageral() {
         return identifiers_especificoparageral;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule especificoparageral.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_especificoparageral(int index) {
        switch (index) {
            case 0: return "estilo.estrutura.Estilos";
            case 1: return "estilo.estrutura.OrdemDetalhamento";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule especificoparageral.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_especificoparageral(int index) {
        switch (index) {
            case 0: return estilo.estrutura.Estilos.class;
            case 1: return estilo.estrutura.OrdemDetalhamento.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule especificoparageral.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_especificoparageral(int index, Object value) {
        switch (index) {
            case 0: this.estilo_estrutura_Estilos_1 = (estilo.estrutura.Estilos) value; break;
            case 1: this.estilo_estrutura_OrdemDetalhamento_1 = (estilo.estrutura.OrdemDetalhamento) value; break;
        }
    }

    /**
     * Returns an object declared in the rule especificoparageral.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_especificoparageral(int index) {
        switch (index) {
            case 0: return estilo_estrutura_Estilos_1;
            case 1: return estilo_estrutura_OrdemDetalhamento_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule especificoparageral
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_especificoparageral() {
        return new Object[] {
                            estilo_estrutura_Estilos_1,
                            estilo_estrutura_OrdemDetalhamento_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule especificoparageral
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_especificoparageral(Object[] objects) {
        estilo_estrutura_Estilos_1 = (estilo.estrutura.Estilos) objects[0];
        estilo_estrutura_OrdemDetalhamento_1 = (estilo.estrutura.OrdemDetalhamento) objects[1];
    }

    /**
     * Condition 0 of rule especificoparageral.<p>
     * The original expression was:<br>
     * <code>ordemDetalhamento.equals(new OrdemDetalhamento("Específico Para Geral"))</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean especificoparageral_cond_0() {
        return (estilo_estrutura_OrdemDetalhamento_1.equals(new OrdemDetalhamento("Específico Para Geral")));
    }

    /**
     * Checks whether some conditions of rule especificoparageral is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean especificoparageral_cond(int index) {
        switch (index) {
            case 0: return especificoparageral_cond_0();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule especificoparageral that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_especificoparageral(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            case 1:
                if (!especificoparageral_cond_0()) return false;
                return true;
            default: return false;
        }
    }

    /**
     * Checks whether all the conditions of a rule which
     * reference some declared element of the declarations are
     * true.
     *
     * @param declIndex the index of the declared element.
     * @return <code>true</code> if the conditions that reference
     *          up to the given declaration are true;
     *          <code>false</code> otherwise.
     */
    private boolean checkCondForDeclaration_especificoparageral(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            case 1:
                return true;
            default: return false;
        }
    }

    /**
     * Executes the action part of the rule especificoparageral
     */
    private void especificoparageral() {
  		estilo_estrutura_Estilos_1.addItens("Verbal,Sequencial,Sensorial,Reflexivo");
  		modified(estilo_estrutura_Estilos_1);
  		flush();		
      }



   
    /**
     * Identifiers of rule geralparaespecifico
     */
    private String[] identifiers_geralparaespecifico = {
        "estilos",
        "ordemDetalhamento"
    };

    /**
     * Returns the identifiers declared in rule geralparaespecifico
     *
     * @return the identifiers declared in rule geralparaespecifico
     */
    private String[] getDeclaredIdentifiers_geralparaespecifico() {
         return identifiers_geralparaespecifico;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule geralparaespecifico.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_geralparaespecifico(int index) {
        switch (index) {
            case 0: return "estilo.estrutura.Estilos";
            case 1: return "estilo.estrutura.OrdemDetalhamento";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule geralparaespecifico.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_geralparaespecifico(int index) {
        switch (index) {
            case 0: return estilo.estrutura.Estilos.class;
            case 1: return estilo.estrutura.OrdemDetalhamento.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule geralparaespecifico.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_geralparaespecifico(int index, Object value) {
        switch (index) {
            case 0: this.estilo_estrutura_Estilos_1 = (estilo.estrutura.Estilos) value; break;
            case 1: this.estilo_estrutura_OrdemDetalhamento_1 = (estilo.estrutura.OrdemDetalhamento) value; break;
        }
    }

    /**
     * Returns an object declared in the rule geralparaespecifico.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_geralparaespecifico(int index) {
        switch (index) {
            case 0: return estilo_estrutura_Estilos_1;
            case 1: return estilo_estrutura_OrdemDetalhamento_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule geralparaespecifico
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_geralparaespecifico() {
        return new Object[] {
                            estilo_estrutura_Estilos_1,
                            estilo_estrutura_OrdemDetalhamento_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule geralparaespecifico
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_geralparaespecifico(Object[] objects) {
        estilo_estrutura_Estilos_1 = (estilo.estrutura.Estilos) objects[0];
        estilo_estrutura_OrdemDetalhamento_1 = (estilo.estrutura.OrdemDetalhamento) objects[1];
    }

    /**
     * Condition 0 of rule geralparaespecifico.<p>
     * The original expression was:<br>
     * <code>ordemDetalhamento.equals(new OrdemDetalhamento("Geral Para Específico"))</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean geralparaespecifico_cond_0() {
        return (estilo_estrutura_OrdemDetalhamento_1.equals(new OrdemDetalhamento("Geral Para Específico")));
    }

    /**
     * Checks whether some conditions of rule geralparaespecifico is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean geralparaespecifico_cond(int index) {
        switch (index) {
            case 0: return geralparaespecifico_cond_0();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule geralparaespecifico that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_geralparaespecifico(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            case 1:
                if (!geralparaespecifico_cond_0()) return false;
                return true;
            default: return false;
        }
    }

    /**
     * Checks whether all the conditions of a rule which
     * reference some declared element of the declarations are
     * true.
     *
     * @param declIndex the index of the declared element.
     * @return <code>true</code> if the conditions that reference
     *          up to the given declaration are true;
     *          <code>false</code> otherwise.
     */
    private boolean checkCondForDeclaration_geralparaespecifico(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            case 1:
                return true;
            default: return false;
        }
    }

    /**
     * Executes the action part of the rule geralparaespecifico
     */
    private void geralparaespecifico() {
  		estilo_estrutura_Estilos_1.addItens("Visual,Global,Intuitivo,Ativo");
  		modified(estilo_estrutura_Estilos_1);
  		flush();		
      }

   

    /**
     * The names of the rules in this class file
     */
    private static final String[] File_ruleNames = {
        "especificoparageral",
        "geralparaespecifico"
    };

    /**
     * Returns the name of the rules in this class file.
     *
     * @return the name of the rules in this class file.
     */
    public String[] getRuleNames() {
        return File_ruleNames;
    }

    /**
     * The number of declarations of the rules in this class file.
     */
    private static final int[] File_numberOfDeclarations = {
        2,
        2
    };

    /**
     * Returns the number of declarations of the rules in this class file.
     *
     * @return the number of declarations  of the rules in this class file.
     */
    public int[] getNumberOfDeclarations() {
        return File_numberOfDeclarations;
    }

    /**
     * The number of conditions of the rules in this class file.
     */
    private static final int[] File_numberOfConditions = {
        1,
        1
    };

    /**
     * Returns the number of conditions of the rules in this class file.
     *
     * @return the number of conditions  of the rules in this class file.
     */
    public int[] getNumberOfConditions() {
        return File_numberOfConditions;
    }

    /**
     * Checks whether a condition of some rule is satisfied.
     *
     * @param ruleIndex the index of the rule to be checked
     * @param condIndex the index of the condition to be checked
     * @return <code>true</code> if the corresponding condition for the
     *          given rule is satisfied. <code>false</code> otherwise.
     */
    public boolean checkCondition(int ruleIndex, int condIndex) {
        switch (ruleIndex) {
            case 0: return especificoparageral_cond(condIndex);
            case 1: return geralparaespecifico_cond(condIndex);
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of some rule that depend only on
     * the given object are satisfied.
     *
     * @param ruleIndex the index of the rule to be checked
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          the given rule are satisfied;
     *           <code>false</code> otherwise.
     */
    public boolean checkConditionsOnlyOf(int ruleIndex, int declIndex) {
        switch (ruleIndex) {
            case 0: return checkConditionsOnlyOf_especificoparageral(declIndex);
            case 1: return checkConditionsOnlyOf_geralparaespecifico(declIndex);
            default: return false;
        }
    }

    /**
     * Checks whether all the conditions of a rule which
     * reference only the elements declared up to the given index
     * are true.
     *
     * @param ruleIndex the index of the rule to be checked
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all the conditions of a rule which
     *          reference only the elements declared up to the given index
     *          are satisfied; <code>false</code> otherwise.
     */
    public boolean checkCondForDeclaration(int ruleIndex, int declIndex) {
        switch (ruleIndex) {
            case 0: return checkCondForDeclaration_especificoparageral(declIndex);
            case 1: return checkCondForDeclaration_geralparaespecifico(declIndex);
            default: return false;
        }
    }

    /**
     * Returns the class name of an object declared in a rule.
     *
     * @param ruleIndex the index of the rule
     * @param declIndex the index of the declaration
     * @return the class name of the declared object.
     */
    public String getDeclaredClassName(int ruleIndex, int declIndex) {
        switch (ruleIndex) {
            case 0: return getDeclaredClassName_especificoparageral(declIndex);
            case 1: return getDeclaredClassName_geralparaespecifico(declIndex);
            default: return null;
        }
    }

    /**
     * Returns the class of an object declared in a rule.
     *
     * @param ruleIndex the index of the rule
     * @param declIndex the index of the declaration
     * @return the class of the declared object.
     */
    public Class getDeclaredClass(int ruleIndex, int declIndex) {
        switch (ruleIndex) {
            case 0: return getDeclaredClass_especificoparageral(declIndex);
            case 1: return getDeclaredClass_geralparaespecifico(declIndex);
            default: return null;
        }
    }

    /**
     * Fires one of the rules in this rule base.
     *
     * @param ruleIndex the index of the rule to be fired
     */
    protected void internalFireRule(int ruleIndex) {
        switch (ruleIndex) {
            case 0: especificoparageral(); break;
            case 1: geralparaespecifico(); break;
        }
    }

    /**
     * Returns the number of rules.
     *
     * @return the number of rules.
     */
    public int getNumberOfRules() {
        return 2;
    }

    /**
     * Returns the identifiers declared in a given rule.
     *
     * @param ruleIndex the index of the rule.
     * @return an array with the identifiers of the rule declarations.
     */
    public String[] getDeclaredIdentifiers(int ruleIndex) {
        switch (ruleIndex) {
            case 0: return getDeclaredIdentifiers_especificoparageral();
            case 1: return getDeclaredIdentifiers_geralparaespecifico();
            default: return new String[0];
        }
    }

    /**
     * Sets an object that represents a declaration of some rule.
     *
     * @param ruleIndex the index of the rule
     * @param declIndex the index of the declaration in the rule.
     * @param value the value of the object being set.
     */
    public void setObject(int ruleIndex, int declIndex, Object value) {
        switch (ruleIndex) {
            case 0: setObject_especificoparageral(declIndex, value); break;
            case 1: setObject_geralparaespecifico(declIndex, value); break;
        }
    }

    /**
     * Returns an object that represents a declaration of some rule.
     *
     * @param ruleIndex the index of the rule
     * @param declIndex the index of the declaration in the rule.
     * @return the value of the corresponding object.
     */
    public Object getObject(int ruleIndex, int declIndex) {
        switch (ruleIndex) {
            case 0: return getObject_especificoparageral(declIndex);
            case 1: return getObject_geralparaespecifico(declIndex);
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations of
     * some rule.
     *
     * @param ruleIndex the index of the rule
     * @return an object array of the variables bound to the
     *          declarations of some rule.
     */
    public Object[] getObjects(int ruleIndex) {
        switch (ruleIndex) {
            case 0: return getObjects_especificoparageral();
            case 1: return getObjects_geralparaespecifico();
            default: return null;
        }
    }
    /**
     * Defines all variables bound to the declarations of
     * some rule.
     *
     * @param ruleIndex the index of the rule
     * @param objects an object array of the variables bound to the
     *          declarations of some rule.
     */
    public void setObjects(int ruleIndex, Object[] objects) {
        switch (ruleIndex) {
            case 0: setObjects_especificoparageral(objects); break;
            case 1: setObjects_geralparaespecifico(objects); break;
        }
    }

    /*
     * The variables declared in the rules.
     */
    private estilo.estrutura.Estilos estilo_estrutura_Estilos_1;
    private estilo.estrutura.OrdemDetalhamento estilo_estrutura_OrdemDetalhamento_1;

    /**
     * Class constructor.
     *
     * @param knowledgeBase the knowledge base that contains this rule base.
     */
    public Jeops_RuleBase_OrdemDetalhamentoKB(jeops.AbstractKnowledgeBase knowledgeBase) {
        super(knowledgeBase);
    }

}
/**
 * Knowledge base created by JEOPS from file OrdemDetalhamentoKB.rules
 *
 * @version 21/10/2015
 */
public class OrdemDetalhamentoKB extends jeops.AbstractKnowledgeBase {

    /**
     * Creates a new knowledge base with the specified conflict set with the
     * desired conflict resolution policy.
     *
     * @param conflictSet a conflict set with the desired resolution policy
     */
    public OrdemDetalhamentoKB(jeops.conflict.ConflictSet conflictSet) {
        super(conflictSet);
    }

    /**
     * Creates a new knowledge base, using the default conflict resolution
     * policy.
     */
    public OrdemDetalhamentoKB() {
        this(new jeops.conflict.DefaultConflictSet());
    }

    /**
     * Factory method used to instantiate the rule base.
     */
    protected jeops.AbstractRuleBase createRuleBase() {
        return new Jeops_RuleBase_OrdemDetalhamentoKB(this);
    }

}
