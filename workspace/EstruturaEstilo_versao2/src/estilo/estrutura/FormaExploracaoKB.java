package estilo.estrutura;

import estilo.recursos.*;
import estilo.util.*;
import java.util.*;

  class Jeops_RuleBase_FormaExploracaoKB
extends jeops.AbstractRuleBase {
   
    /**
     * Identifiers of rule rede
     */
    private String[] identifiers_rede = {
        "estilos",
        "formaExploracao"
    };

    /**
     * Returns the identifiers declared in rule rede
     *
     * @return the identifiers declared in rule rede
     */
    private String[] getDeclaredIdentifiers_rede() {
         return identifiers_rede;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule rede.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_rede(int index) {
        switch (index) {
            case 0: return "estilo.estrutura.Estilos";
            case 1: return "estilo.estrutura.FormaExploracao";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule rede.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_rede(int index) {
        switch (index) {
            case 0: return estilo.estrutura.Estilos.class;
            case 1: return estilo.estrutura.FormaExploracao.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule rede.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_rede(int index, Object value) {
        switch (index) {
            case 0: this.estilo_estrutura_Estilos_1 = (estilo.estrutura.Estilos) value; break;
            case 1: this.estilo_estrutura_FormaExploracao_1 = (estilo.estrutura.FormaExploracao) value; break;
        }
    }

    /**
     * Returns an object declared in the rule rede.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_rede(int index) {
        switch (index) {
            case 0: return estilo_estrutura_Estilos_1;
            case 1: return estilo_estrutura_FormaExploracao_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule rede
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_rede() {
        return new Object[] {
                            estilo_estrutura_Estilos_1,
                            estilo_estrutura_FormaExploracao_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule rede
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_rede(Object[] objects) {
        estilo_estrutura_Estilos_1 = (estilo.estrutura.Estilos) objects[0];
        estilo_estrutura_FormaExploracao_1 = (estilo.estrutura.FormaExploracao) objects[1];
    }

    /**
     * Condition 0 of rule rede.<p>
     * The original expression was:<br>
     * <code>formaExploracao.equals(new FormaExploracao("Rede"))</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean rede_cond_0() {
        return (estilo_estrutura_FormaExploracao_1.equals(new FormaExploracao("Rede")));
    }

    /**
     * Checks whether some conditions of rule rede is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean rede_cond(int index) {
        switch (index) {
            case 0: return rede_cond_0();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule rede that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_rede(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            case 1:
                if (!rede_cond_0()) return false;
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
    private boolean checkCondForDeclaration_rede(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            case 1:
                return true;
            default: return false;
        }
    }

    /**
     * Executes the action part of the rule rede
     */
    private void rede() {
  		estilo_estrutura_Estilos_1.addItens("Visual,Global,Intuitivo,Ativo");
  		modified(estilo_estrutura_Estilos_1);
  		flush();		
      }



   
    /**
     * Identifiers of rule linear
     */
    private String[] identifiers_linear = {
        "estilos",
        "formaExploracao"
    };

    /**
     * Returns the identifiers declared in rule linear
     *
     * @return the identifiers declared in rule linear
     */
    private String[] getDeclaredIdentifiers_linear() {
         return identifiers_linear;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule linear.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_linear(int index) {
        switch (index) {
            case 0: return "estilo.estrutura.Estilos";
            case 1: return "estilo.estrutura.FormaExploracao";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule linear.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_linear(int index) {
        switch (index) {
            case 0: return estilo.estrutura.Estilos.class;
            case 1: return estilo.estrutura.FormaExploracao.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule linear.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_linear(int index, Object value) {
        switch (index) {
            case 0: this.estilo_estrutura_Estilos_1 = (estilo.estrutura.Estilos) value; break;
            case 1: this.estilo_estrutura_FormaExploracao_1 = (estilo.estrutura.FormaExploracao) value; break;
        }
    }

    /**
     * Returns an object declared in the rule linear.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_linear(int index) {
        switch (index) {
            case 0: return estilo_estrutura_Estilos_1;
            case 1: return estilo_estrutura_FormaExploracao_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule linear
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_linear() {
        return new Object[] {
                            estilo_estrutura_Estilos_1,
                            estilo_estrutura_FormaExploracao_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule linear
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_linear(Object[] objects) {
        estilo_estrutura_Estilos_1 = (estilo.estrutura.Estilos) objects[0];
        estilo_estrutura_FormaExploracao_1 = (estilo.estrutura.FormaExploracao) objects[1];
    }

    /**
     * Condition 0 of rule linear.<p>
     * The original expression was:<br>
     * <code>formaExploracao.equals(new FormaExploracao("Linear"))</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean linear_cond_0() {
        return (estilo_estrutura_FormaExploracao_1.equals(new FormaExploracao("Linear")));
    }

    /**
     * Checks whether some conditions of rule linear is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean linear_cond(int index) {
        switch (index) {
            case 0: return linear_cond_0();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule linear that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_linear(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            case 1:
                if (!linear_cond_0()) return false;
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
    private boolean checkCondForDeclaration_linear(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            case 1:
                return true;
            default: return false;
        }
    }

    /**
     * Executes the action part of the rule linear
     */
    private void linear() {
  		estilo_estrutura_Estilos_1.addItens("Verbal,Sequencial,Sensorial,Reflexivo");
  		modified(estilo_estrutura_Estilos_1);
  		flush();		
      }

   

    /**
     * The names of the rules in this class file
     */
    private static final String[] File_ruleNames = {
        "rede",
        "linear"
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
            case 0: return rede_cond(condIndex);
            case 1: return linear_cond(condIndex);
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
            case 0: return checkConditionsOnlyOf_rede(declIndex);
            case 1: return checkConditionsOnlyOf_linear(declIndex);
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
            case 0: return checkCondForDeclaration_rede(declIndex);
            case 1: return checkCondForDeclaration_linear(declIndex);
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
            case 0: return getDeclaredClassName_rede(declIndex);
            case 1: return getDeclaredClassName_linear(declIndex);
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
            case 0: return getDeclaredClass_rede(declIndex);
            case 1: return getDeclaredClass_linear(declIndex);
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
            case 0: rede(); break;
            case 1: linear(); break;
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
            case 0: return getDeclaredIdentifiers_rede();
            case 1: return getDeclaredIdentifiers_linear();
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
            case 0: setObject_rede(declIndex, value); break;
            case 1: setObject_linear(declIndex, value); break;
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
            case 0: return getObject_rede(declIndex);
            case 1: return getObject_linear(declIndex);
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
            case 0: return getObjects_rede();
            case 1: return getObjects_linear();
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
            case 0: setObjects_rede(objects); break;
            case 1: setObjects_linear(objects); break;
        }
    }

    /*
     * The variables declared in the rules.
     */
    private estilo.estrutura.Estilos estilo_estrutura_Estilos_1;
    private estilo.estrutura.FormaExploracao estilo_estrutura_FormaExploracao_1;

    /**
     * Class constructor.
     *
     * @param knowledgeBase the knowledge base that contains this rule base.
     */
    public Jeops_RuleBase_FormaExploracaoKB(jeops.AbstractKnowledgeBase knowledgeBase) {
        super(knowledgeBase);
    }

}
/**
 * Knowledge base created by JEOPS from file FormaExploracaoKB.rules
 *
 * @version 28/07/2016
 */
public class FormaExploracaoKB extends jeops.AbstractKnowledgeBase {

    /**
     * Creates a new knowledge base with the specified conflict set with the
     * desired conflict resolution policy.
     *
     * @param conflictSet a conflict set with the desired resolution policy
     */
    public FormaExploracaoKB(jeops.conflict.ConflictSet conflictSet) {
        super(conflictSet);
    }

    /**
     * Creates a new knowledge base, using the default conflict resolution
     * policy.
     */
    public FormaExploracaoKB() {
        this(new jeops.conflict.DefaultConflictSet());
    }

    /**
     * Factory method used to instantiate the rule base.
     */
    protected jeops.AbstractRuleBase createRuleBase() {
        return new Jeops_RuleBase_FormaExploracaoKB(this);
    }

}
