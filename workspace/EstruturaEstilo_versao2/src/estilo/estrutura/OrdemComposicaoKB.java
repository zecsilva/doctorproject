package estilo.estrutura;

import estilo.recursos.*;
import estilo.util.*;
import java.util.*;

  class Jeops_RuleBase_OrdemComposicaoKB
extends jeops.AbstractRuleBase {
   
    /**
     * Identifiers of rule estilos_1
     */
    private String[] identifiers_estilos_1 = {
        "estilos",
        "ordemComposicao"
    };

    /**
     * Returns the identifiers declared in rule estilos_1
     *
     * @return the identifiers declared in rule estilos_1
     */
    private String[] getDeclaredIdentifiers_estilos_1() {
         return identifiers_estilos_1;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule estilos_1.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_estilos_1(int index) {
        switch (index) {
            case 0: return "estilo.estrutura.Estilos";
            case 1: return "estilo.estrutura.OrdemComposicao";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule estilos_1.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_estilos_1(int index) {
        switch (index) {
            case 0: return estilo.estrutura.Estilos.class;
            case 1: return estilo.estrutura.OrdemComposicao.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule estilos_1.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_estilos_1(int index, Object value) {
        switch (index) {
            case 0: this.estilo_estrutura_Estilos_1 = (estilo.estrutura.Estilos) value; break;
            case 1: this.estilo_estrutura_OrdemComposicao_1 = (estilo.estrutura.OrdemComposicao) value; break;
        }
    }

    /**
     * Returns an object declared in the rule estilos_1.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_estilos_1(int index) {
        switch (index) {
            case 0: return estilo_estrutura_Estilos_1;
            case 1: return estilo_estrutura_OrdemComposicao_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule estilos_1
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_estilos_1() {
        return new Object[] {
                            estilo_estrutura_Estilos_1,
                            estilo_estrutura_OrdemComposicao_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule estilos_1
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_estilos_1(Object[] objects) {
        estilo_estrutura_Estilos_1 = (estilo.estrutura.Estilos) objects[0];
        estilo_estrutura_OrdemComposicao_1 = (estilo.estrutura.OrdemComposicao) objects[1];
    }

    /**
     * Condition 0 of rule estilos_1.<p>
     * The original expression was:<br>
     * <code>ordemComposicao.equals(new OrdemComposicao(Constantes.ORDEM_COMPOSICAO_1))</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean estilos_1_cond_0() {
        return (estilo_estrutura_OrdemComposicao_1.equals(new OrdemComposicao(Constantes.ORDEM_COMPOSICAO_1)));
    }

    /**
     * Checks whether some conditions of rule estilos_1 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean estilos_1_cond(int index) {
        switch (index) {
            case 0: return estilos_1_cond_0();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule estilos_1 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_estilos_1(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            case 1:
                if (!estilos_1_cond_0()) return false;
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
    private boolean checkCondForDeclaration_estilos_1(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            case 1:
                return true;
            default: return false;
        }
    }

    /**
     * Executes the action part of the rule estilos_1
     */
    private void estilos_1() {
  		estilo_estrutura_Estilos_1.addItens("Intuitivo,Reflexivo");
  		modified(estilo_estrutura_Estilos_1);
  		flush();		
      }


  
  
    /**
     * Identifiers of rule estilos_2
     */
    private String[] identifiers_estilos_2 = {
        "estilos",
        "ordemComposicao"
    };

    /**
     * Returns the identifiers declared in rule estilos_2
     *
     * @return the identifiers declared in rule estilos_2
     */
    private String[] getDeclaredIdentifiers_estilos_2() {
         return identifiers_estilos_2;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule estilos_2.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_estilos_2(int index) {
        switch (index) {
            case 0: return "estilo.estrutura.Estilos";
            case 1: return "estilo.estrutura.OrdemComposicao";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule estilos_2.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_estilos_2(int index) {
        switch (index) {
            case 0: return estilo.estrutura.Estilos.class;
            case 1: return estilo.estrutura.OrdemComposicao.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule estilos_2.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_estilos_2(int index, Object value) {
        switch (index) {
            case 0: this.estilo_estrutura_Estilos_1 = (estilo.estrutura.Estilos) value; break;
            case 1: this.estilo_estrutura_OrdemComposicao_1 = (estilo.estrutura.OrdemComposicao) value; break;
        }
    }

    /**
     * Returns an object declared in the rule estilos_2.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_estilos_2(int index) {
        switch (index) {
            case 0: return estilo_estrutura_Estilos_1;
            case 1: return estilo_estrutura_OrdemComposicao_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule estilos_2
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_estilos_2() {
        return new Object[] {
                            estilo_estrutura_Estilos_1,
                            estilo_estrutura_OrdemComposicao_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule estilos_2
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_estilos_2(Object[] objects) {
        estilo_estrutura_Estilos_1 = (estilo.estrutura.Estilos) objects[0];
        estilo_estrutura_OrdemComposicao_1 = (estilo.estrutura.OrdemComposicao) objects[1];
    }

    /**
     * Condition 0 of rule estilos_2.<p>
     * The original expression was:<br>
     * <code>ordemComposicao.equals(new OrdemComposicao(Constantes.ORDEM_COMPOSICAO_2))</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean estilos_2_cond_0() {
        return (estilo_estrutura_OrdemComposicao_1.equals(new OrdemComposicao(Constantes.ORDEM_COMPOSICAO_2)));
    }

    /**
     * Checks whether some conditions of rule estilos_2 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean estilos_2_cond(int index) {
        switch (index) {
            case 0: return estilos_2_cond_0();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule estilos_2 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_estilos_2(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            case 1:
                if (!estilos_2_cond_0()) return false;
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
    private boolean checkCondForDeclaration_estilos_2(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            case 1:
                return true;
            default: return false;
        }
    }

    /**
     * Executes the action part of the rule estilos_2
     */
    private void estilos_2() {
  		estilo_estrutura_Estilos_1.addItens("Ativo,Sequencial");
  		modified(estilo_estrutura_Estilos_1);
  		flush();		
      }


  
   
    /**
     * Identifiers of rule estilos_3
     */
    private String[] identifiers_estilos_3 = {
        "estilos",
        "ordemComposicao"
    };

    /**
     * Returns the identifiers declared in rule estilos_3
     *
     * @return the identifiers declared in rule estilos_3
     */
    private String[] getDeclaredIdentifiers_estilos_3() {
         return identifiers_estilos_3;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule estilos_3.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_estilos_3(int index) {
        switch (index) {
            case 0: return "estilo.estrutura.Estilos";
            case 1: return "estilo.estrutura.OrdemComposicao";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule estilos_3.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_estilos_3(int index) {
        switch (index) {
            case 0: return estilo.estrutura.Estilos.class;
            case 1: return estilo.estrutura.OrdemComposicao.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule estilos_3.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_estilos_3(int index, Object value) {
        switch (index) {
            case 0: this.estilo_estrutura_Estilos_1 = (estilo.estrutura.Estilos) value; break;
            case 1: this.estilo_estrutura_OrdemComposicao_1 = (estilo.estrutura.OrdemComposicao) value; break;
        }
    }

    /**
     * Returns an object declared in the rule estilos_3.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_estilos_3(int index) {
        switch (index) {
            case 0: return estilo_estrutura_Estilos_1;
            case 1: return estilo_estrutura_OrdemComposicao_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule estilos_3
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_estilos_3() {
        return new Object[] {
                            estilo_estrutura_Estilos_1,
                            estilo_estrutura_OrdemComposicao_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule estilos_3
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_estilos_3(Object[] objects) {
        estilo_estrutura_Estilos_1 = (estilo.estrutura.Estilos) objects[0];
        estilo_estrutura_OrdemComposicao_1 = (estilo.estrutura.OrdemComposicao) objects[1];
    }

    /**
     * Condition 0 of rule estilos_3.<p>
     * The original expression was:<br>
     * <code>ordemComposicao.equals(new OrdemComposicao(Constantes.ORDEM_COMPOSICAO_3))</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean estilos_3_cond_0() {
        return (estilo_estrutura_OrdemComposicao_1.equals(new OrdemComposicao(Constantes.ORDEM_COMPOSICAO_3)));
    }

    /**
     * Checks whether some conditions of rule estilos_3 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean estilos_3_cond(int index) {
        switch (index) {
            case 0: return estilos_3_cond_0();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule estilos_3 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_estilos_3(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            case 1:
                if (!estilos_3_cond_0()) return false;
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
    private boolean checkCondForDeclaration_estilos_3(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            case 1:
                return true;
            default: return false;
        }
    }

    /**
     * Executes the action part of the rule estilos_3
     */
    private void estilos_3() {
 		estilo_estrutura_Estilos_1.addItens("Verbal,Visual,Global,Sensorial");
  		modified(estilo_estrutura_Estilos_1);
  		flush();		
      }


  

    /**
     * The names of the rules in this class file
     */
    private static final String[] File_ruleNames = {
        "estilos_1",
        "estilos_2",
        "estilos_3"
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
            case 0: return estilos_1_cond(condIndex);
            case 1: return estilos_2_cond(condIndex);
            case 2: return estilos_3_cond(condIndex);
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
            case 0: return checkConditionsOnlyOf_estilos_1(declIndex);
            case 1: return checkConditionsOnlyOf_estilos_2(declIndex);
            case 2: return checkConditionsOnlyOf_estilos_3(declIndex);
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
            case 0: return checkCondForDeclaration_estilos_1(declIndex);
            case 1: return checkCondForDeclaration_estilos_2(declIndex);
            case 2: return checkCondForDeclaration_estilos_3(declIndex);
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
            case 0: return getDeclaredClassName_estilos_1(declIndex);
            case 1: return getDeclaredClassName_estilos_2(declIndex);
            case 2: return getDeclaredClassName_estilos_3(declIndex);
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
            case 0: return getDeclaredClass_estilos_1(declIndex);
            case 1: return getDeclaredClass_estilos_2(declIndex);
            case 2: return getDeclaredClass_estilos_3(declIndex);
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
            case 0: estilos_1(); break;
            case 1: estilos_2(); break;
            case 2: estilos_3(); break;
        }
    }

    /**
     * Returns the number of rules.
     *
     * @return the number of rules.
     */
    public int getNumberOfRules() {
        return 3;
    }

    /**
     * Returns the identifiers declared in a given rule.
     *
     * @param ruleIndex the index of the rule.
     * @return an array with the identifiers of the rule declarations.
     */
    public String[] getDeclaredIdentifiers(int ruleIndex) {
        switch (ruleIndex) {
            case 0: return getDeclaredIdentifiers_estilos_1();
            case 1: return getDeclaredIdentifiers_estilos_2();
            case 2: return getDeclaredIdentifiers_estilos_3();
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
            case 0: setObject_estilos_1(declIndex, value); break;
            case 1: setObject_estilos_2(declIndex, value); break;
            case 2: setObject_estilos_3(declIndex, value); break;
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
            case 0: return getObject_estilos_1(declIndex);
            case 1: return getObject_estilos_2(declIndex);
            case 2: return getObject_estilos_3(declIndex);
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
            case 0: return getObjects_estilos_1();
            case 1: return getObjects_estilos_2();
            case 2: return getObjects_estilos_3();
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
            case 0: setObjects_estilos_1(objects); break;
            case 1: setObjects_estilos_2(objects); break;
            case 2: setObjects_estilos_3(objects); break;
        }
    }

    /*
     * The variables declared in the rules.
     */
    private estilo.estrutura.Estilos estilo_estrutura_Estilos_1;
    private estilo.estrutura.OrdemComposicao estilo_estrutura_OrdemComposicao_1;

    /**
     * Class constructor.
     *
     * @param knowledgeBase the knowledge base that contains this rule base.
     */
    public Jeops_RuleBase_OrdemComposicaoKB(jeops.AbstractKnowledgeBase knowledgeBase) {
        super(knowledgeBase);
    }

}
/**
 * Knowledge base created by JEOPS from file OrdemComposicaoKB.rules
 *
 * @version 23/10/2015
 */
public class OrdemComposicaoKB extends jeops.AbstractKnowledgeBase {

    /**
     * Creates a new knowledge base with the specified conflict set with the
     * desired conflict resolution policy.
     *
     * @param conflictSet a conflict set with the desired resolution policy
     */
    public OrdemComposicaoKB(jeops.conflict.ConflictSet conflictSet) {
        super(conflictSet);
    }

    /**
     * Creates a new knowledge base, using the default conflict resolution
     * policy.
     */
    public OrdemComposicaoKB() {
        this(new jeops.conflict.DefaultConflictSet());
    }

    /**
     * Factory method used to instantiate the rule base.
     */
    protected jeops.AbstractRuleBase createRuleBase() {
        return new Jeops_RuleBase_OrdemComposicaoKB(this);
    }

}
