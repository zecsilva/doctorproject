package estilo.estrutura;

import estilo.recursos.*;
import estilo.util.*;
import java.util.*;

  class Jeops_RuleBase_RecursosKB
extends jeops.AbstractRuleBase {
   
    /**
     * Identifiers of rule animacao
     */
    private String[] identifiers_animacao = {
        "estilos",
        "recurso"
    };

    /**
     * Returns the identifiers declared in rule animacao
     *
     * @return the identifiers declared in rule animacao
     */
    private String[] getDeclaredIdentifiers_animacao() {
         return identifiers_animacao;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule animacao.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_animacao(int index) {
        switch (index) {
            case 0: return "estilo.estrutura.Estilos";
            case 1: return "estilo.estrutura.RecursoEstilo";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule animacao.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_animacao(int index) {
        switch (index) {
            case 0: return estilo.estrutura.Estilos.class;
            case 1: return estilo.estrutura.RecursoEstilo.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule animacao.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_animacao(int index, Object value) {
        switch (index) {
            case 0: this.estilo_estrutura_Estilos_1 = (estilo.estrutura.Estilos) value; break;
            case 1: this.estilo_estrutura_RecursoEstilo_1 = (estilo.estrutura.RecursoEstilo) value; break;
        }
    }

    /**
     * Returns an object declared in the rule animacao.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_animacao(int index) {
        switch (index) {
            case 0: return estilo_estrutura_Estilos_1;
            case 1: return estilo_estrutura_RecursoEstilo_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule animacao
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_animacao() {
        return new Object[] {
                            estilo_estrutura_Estilos_1,
                            estilo_estrutura_RecursoEstilo_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule animacao
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_animacao(Object[] objects) {
        estilo_estrutura_Estilos_1 = (estilo.estrutura.Estilos) objects[0];
        estilo_estrutura_RecursoEstilo_1 = (estilo.estrutura.RecursoEstilo) objects[1];
    }

    /**
     * Condition 0 of rule animacao.<p>
     * The original expression was:<br>
     * <code>recurso instanceof Animacao</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean animacao_cond_0() {
        return (estilo_estrutura_RecursoEstilo_1 instanceof Animacao);
    }

    /**
     * Checks whether some conditions of rule animacao is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean animacao_cond(int index) {
        switch (index) {
            case 0: return animacao_cond_0();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule animacao that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_animacao(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            case 1:
                if (!animacao_cond_0()) return false;
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
    private boolean checkCondForDeclaration_animacao(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            case 1:
                return true;
            default: return false;
        }
    }

    /**
     * Executes the action part of the rule animacao
     */
    private void animacao() {
  		estilo_estrutura_Estilos_1.addItens("Visual,Sequencial,Reflexivo,Intuitivo");
  		modified(estilo_estrutura_Estilos_1);
  		flush();		
      }


  
   
    /**
     * Identifiers of rule autoavaliacao
     */
    private String[] identifiers_autoavaliacao = {
        "estilos",
        "recurso"
    };

    /**
     * Returns the identifiers declared in rule autoavaliacao
     *
     * @return the identifiers declared in rule autoavaliacao
     */
    private String[] getDeclaredIdentifiers_autoavaliacao() {
         return identifiers_autoavaliacao;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule autoavaliacao.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_autoavaliacao(int index) {
        switch (index) {
            case 0: return "estilo.estrutura.Estilos";
            case 1: return "estilo.estrutura.RecursoEstilo";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule autoavaliacao.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_autoavaliacao(int index) {
        switch (index) {
            case 0: return estilo.estrutura.Estilos.class;
            case 1: return estilo.estrutura.RecursoEstilo.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule autoavaliacao.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_autoavaliacao(int index, Object value) {
        switch (index) {
            case 0: this.estilo_estrutura_Estilos_1 = (estilo.estrutura.Estilos) value; break;
            case 1: this.estilo_estrutura_RecursoEstilo_1 = (estilo.estrutura.RecursoEstilo) value; break;
        }
    }

    /**
     * Returns an object declared in the rule autoavaliacao.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_autoavaliacao(int index) {
        switch (index) {
            case 0: return estilo_estrutura_Estilos_1;
            case 1: return estilo_estrutura_RecursoEstilo_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule autoavaliacao
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_autoavaliacao() {
        return new Object[] {
                            estilo_estrutura_Estilos_1,
                            estilo_estrutura_RecursoEstilo_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule autoavaliacao
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_autoavaliacao(Object[] objects) {
        estilo_estrutura_Estilos_1 = (estilo.estrutura.Estilos) objects[0];
        estilo_estrutura_RecursoEstilo_1 = (estilo.estrutura.RecursoEstilo) objects[1];
    }

    /**
     * Condition 0 of rule autoavaliacao.<p>
     * The original expression was:<br>
     * <code>recurso instanceof AutoAvaliacao</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean autoavaliacao_cond_0() {
        return (estilo_estrutura_RecursoEstilo_1 instanceof AutoAvaliacao);
    }

    /**
     * Checks whether some conditions of rule autoavaliacao is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean autoavaliacao_cond(int index) {
        switch (index) {
            case 0: return autoavaliacao_cond_0();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule autoavaliacao that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_autoavaliacao(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            case 1:
                if (!autoavaliacao_cond_0()) return false;
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
    private boolean checkCondForDeclaration_autoavaliacao(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            case 1:
                return true;
            default: return false;
        }
    }

    /**
     * Executes the action part of the rule autoavaliacao
     */
    private void autoavaliacao() {
  		estilo_estrutura_Estilos_1.addItens("Verbal,Visual,Sequencial,Global,Sensorial,Intuitivo,Ativo,Reflexivo");
  		modified(estilo_estrutura_Estilos_1);
  		flush();		
      }



   
    /**
     * Identifiers of rule demonstracao
     */
    private String[] identifiers_demonstracao = {
        "estilos",
        "recurso"
    };

    /**
     * Returns the identifiers declared in rule demonstracao
     *
     * @return the identifiers declared in rule demonstracao
     */
    private String[] getDeclaredIdentifiers_demonstracao() {
         return identifiers_demonstracao;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule demonstracao.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_demonstracao(int index) {
        switch (index) {
            case 0: return "estilo.estrutura.Estilos";
            case 1: return "estilo.estrutura.RecursoEstilo";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule demonstracao.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_demonstracao(int index) {
        switch (index) {
            case 0: return estilo.estrutura.Estilos.class;
            case 1: return estilo.estrutura.RecursoEstilo.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule demonstracao.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_demonstracao(int index, Object value) {
        switch (index) {
            case 0: this.estilo_estrutura_Estilos_1 = (estilo.estrutura.Estilos) value; break;
            case 1: this.estilo_estrutura_RecursoEstilo_1 = (estilo.estrutura.RecursoEstilo) value; break;
        }
    }

    /**
     * Returns an object declared in the rule demonstracao.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_demonstracao(int index) {
        switch (index) {
            case 0: return estilo_estrutura_Estilos_1;
            case 1: return estilo_estrutura_RecursoEstilo_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule demonstracao
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_demonstracao() {
        return new Object[] {
                            estilo_estrutura_Estilos_1,
                            estilo_estrutura_RecursoEstilo_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule demonstracao
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_demonstracao(Object[] objects) {
        estilo_estrutura_Estilos_1 = (estilo.estrutura.Estilos) objects[0];
        estilo_estrutura_RecursoEstilo_1 = (estilo.estrutura.RecursoEstilo) objects[1];
    }

    /**
     * Condition 0 of rule demonstracao.<p>
     * The original expression was:<br>
     * <code>recurso instanceof Demonstracao</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean demonstracao_cond_0() {
        return (estilo_estrutura_RecursoEstilo_1 instanceof Demonstracao);
    }

    /**
     * Checks whether some conditions of rule demonstracao is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean demonstracao_cond(int index) {
        switch (index) {
            case 0: return demonstracao_cond_0();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule demonstracao that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_demonstracao(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            case 1:
                if (!demonstracao_cond_0()) return false;
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
    private boolean checkCondForDeclaration_demonstracao(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            case 1:
                return true;
            default: return false;
        }
    }

    /**
     * Executes the action part of the rule demonstracao
     */
    private void demonstracao() {
  		estilo_estrutura_Estilos_1.addItens("Verbal,Visual,Sequencial,Sensorial,Reflexivo");
  		modified(estilo_estrutura_Estilos_1);
  		flush();		
      }



   
    /**
     * Identifiers of rule diagrama
     */
    private String[] identifiers_diagrama = {
        "estilos",
        "recurso"
    };

    /**
     * Returns the identifiers declared in rule diagrama
     *
     * @return the identifiers declared in rule diagrama
     */
    private String[] getDeclaredIdentifiers_diagrama() {
         return identifiers_diagrama;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule diagrama.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_diagrama(int index) {
        switch (index) {
            case 0: return "estilo.estrutura.Estilos";
            case 1: return "estilo.estrutura.RecursoEstilo";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule diagrama.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_diagrama(int index) {
        switch (index) {
            case 0: return estilo.estrutura.Estilos.class;
            case 1: return estilo.estrutura.RecursoEstilo.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule diagrama.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_diagrama(int index, Object value) {
        switch (index) {
            case 0: this.estilo_estrutura_Estilos_1 = (estilo.estrutura.Estilos) value; break;
            case 1: this.estilo_estrutura_RecursoEstilo_1 = (estilo.estrutura.RecursoEstilo) value; break;
        }
    }

    /**
     * Returns an object declared in the rule diagrama.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_diagrama(int index) {
        switch (index) {
            case 0: return estilo_estrutura_Estilos_1;
            case 1: return estilo_estrutura_RecursoEstilo_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule diagrama
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_diagrama() {
        return new Object[] {
                            estilo_estrutura_Estilos_1,
                            estilo_estrutura_RecursoEstilo_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule diagrama
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_diagrama(Object[] objects) {
        estilo_estrutura_Estilos_1 = (estilo.estrutura.Estilos) objects[0];
        estilo_estrutura_RecursoEstilo_1 = (estilo.estrutura.RecursoEstilo) objects[1];
    }

    /**
     * Condition 0 of rule diagrama.<p>
     * The original expression was:<br>
     * <code>recurso instanceof Diagrama</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean diagrama_cond_0() {
        return (estilo_estrutura_RecursoEstilo_1 instanceof Diagrama);
    }

    /**
     * Checks whether some conditions of rule diagrama is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean diagrama_cond(int index) {
        switch (index) {
            case 0: return diagrama_cond_0();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule diagrama that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_diagrama(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            case 1:
                if (!diagrama_cond_0()) return false;
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
    private boolean checkCondForDeclaration_diagrama(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            case 1:
                return true;
            default: return false;
        }
    }

    /**
     * Executes the action part of the rule diagrama
     */
    private void diagrama() {
  		estilo_estrutura_Estilos_1.addItens("Verbal,Visual,Sequencial,Global,Ativo,Reflexivo");
  		modified(estilo_estrutura_Estilos_1);
  		flush();		
      }



   
    /**
     * Identifiers of rule esquema
     */
    private String[] identifiers_esquema = {
        "estilos",
        "recurso"
    };

    /**
     * Returns the identifiers declared in rule esquema
     *
     * @return the identifiers declared in rule esquema
     */
    private String[] getDeclaredIdentifiers_esquema() {
         return identifiers_esquema;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule esquema.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_esquema(int index) {
        switch (index) {
            case 0: return "estilo.estrutura.Estilos";
            case 1: return "estilo.estrutura.RecursoEstilo";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule esquema.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_esquema(int index) {
        switch (index) {
            case 0: return estilo.estrutura.Estilos.class;
            case 1: return estilo.estrutura.RecursoEstilo.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule esquema.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_esquema(int index, Object value) {
        switch (index) {
            case 0: this.estilo_estrutura_Estilos_1 = (estilo.estrutura.Estilos) value; break;
            case 1: this.estilo_estrutura_RecursoEstilo_1 = (estilo.estrutura.RecursoEstilo) value; break;
        }
    }

    /**
     * Returns an object declared in the rule esquema.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_esquema(int index) {
        switch (index) {
            case 0: return estilo_estrutura_Estilos_1;
            case 1: return estilo_estrutura_RecursoEstilo_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule esquema
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_esquema() {
        return new Object[] {
                            estilo_estrutura_Estilos_1,
                            estilo_estrutura_RecursoEstilo_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule esquema
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_esquema(Object[] objects) {
        estilo_estrutura_Estilos_1 = (estilo.estrutura.Estilos) objects[0];
        estilo_estrutura_RecursoEstilo_1 = (estilo.estrutura.RecursoEstilo) objects[1];
    }

    /**
     * Condition 0 of rule esquema.<p>
     * The original expression was:<br>
     * <code>recurso instanceof Esquema</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean esquema_cond_0() {
        return (estilo_estrutura_RecursoEstilo_1 instanceof Esquema);
    }

    /**
     * Checks whether some conditions of rule esquema is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean esquema_cond(int index) {
        switch (index) {
            case 0: return esquema_cond_0();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule esquema that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_esquema(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            case 1:
                if (!esquema_cond_0()) return false;
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
    private boolean checkCondForDeclaration_esquema(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            case 1:
                return true;
            default: return false;
        }
    }

    /**
     * Executes the action part of the rule esquema
     */
    private void esquema() {
  		estilo_estrutura_Estilos_1.addItens("Visual,Sequencial,Global,Ativo,Reflexivo");
  		modified(estilo_estrutura_Estilos_1);
  		flush();		
      }



   
    /**
     * Identifiers of rule exemplo
     */
    private String[] identifiers_exemplo = {
        "estilos",
        "recurso"
    };

    /**
     * Returns the identifiers declared in rule exemplo
     *
     * @return the identifiers declared in rule exemplo
     */
    private String[] getDeclaredIdentifiers_exemplo() {
         return identifiers_exemplo;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule exemplo.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_exemplo(int index) {
        switch (index) {
            case 0: return "estilo.estrutura.Estilos";
            case 1: return "estilo.estrutura.RecursoEstilo";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule exemplo.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_exemplo(int index) {
        switch (index) {
            case 0: return estilo.estrutura.Estilos.class;
            case 1: return estilo.estrutura.RecursoEstilo.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule exemplo.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_exemplo(int index, Object value) {
        switch (index) {
            case 0: this.estilo_estrutura_Estilos_1 = (estilo.estrutura.Estilos) value; break;
            case 1: this.estilo_estrutura_RecursoEstilo_1 = (estilo.estrutura.RecursoEstilo) value; break;
        }
    }

    /**
     * Returns an object declared in the rule exemplo.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_exemplo(int index) {
        switch (index) {
            case 0: return estilo_estrutura_Estilos_1;
            case 1: return estilo_estrutura_RecursoEstilo_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule exemplo
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_exemplo() {
        return new Object[] {
                            estilo_estrutura_Estilos_1,
                            estilo_estrutura_RecursoEstilo_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule exemplo
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_exemplo(Object[] objects) {
        estilo_estrutura_Estilos_1 = (estilo.estrutura.Estilos) objects[0];
        estilo_estrutura_RecursoEstilo_1 = (estilo.estrutura.RecursoEstilo) objects[1];
    }

    /**
     * Condition 0 of rule exemplo.<p>
     * The original expression was:<br>
     * <code>recurso instanceof Exemplo</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean exemplo_cond_0() {
        return (estilo_estrutura_RecursoEstilo_1 instanceof Exemplo);
    }

    /**
     * Checks whether some conditions of rule exemplo is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean exemplo_cond(int index) {
        switch (index) {
            case 0: return exemplo_cond_0();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule exemplo that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_exemplo(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            case 1:
                if (!exemplo_cond_0()) return false;
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
    private boolean checkCondForDeclaration_exemplo(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            case 1:
                return true;
            default: return false;
        }
    }

    /**
     * Executes the action part of the rule exemplo
     */
    private void exemplo() {
  		estilo_estrutura_Estilos_1.addItens("Verbal,Visual,Sequencial,Global,Sensorial,Intuitivo,Ativo,Reflexivo");
  		modified(estilo_estrutura_Estilos_1);
  		flush();		
      }



   
    /**
     * Identifiers of rule exercicio
     */
    private String[] identifiers_exercicio = {
        "estilos",
        "recurso"
    };

    /**
     * Returns the identifiers declared in rule exercicio
     *
     * @return the identifiers declared in rule exercicio
     */
    private String[] getDeclaredIdentifiers_exercicio() {
         return identifiers_exercicio;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule exercicio.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_exercicio(int index) {
        switch (index) {
            case 0: return "estilo.estrutura.Estilos";
            case 1: return "estilo.estrutura.RecursoEstilo";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule exercicio.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_exercicio(int index) {
        switch (index) {
            case 0: return estilo.estrutura.Estilos.class;
            case 1: return estilo.estrutura.RecursoEstilo.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule exercicio.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_exercicio(int index, Object value) {
        switch (index) {
            case 0: this.estilo_estrutura_Estilos_1 = (estilo.estrutura.Estilos) value; break;
            case 1: this.estilo_estrutura_RecursoEstilo_1 = (estilo.estrutura.RecursoEstilo) value; break;
        }
    }

    /**
     * Returns an object declared in the rule exercicio.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_exercicio(int index) {
        switch (index) {
            case 0: return estilo_estrutura_Estilos_1;
            case 1: return estilo_estrutura_RecursoEstilo_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule exercicio
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_exercicio() {
        return new Object[] {
                            estilo_estrutura_Estilos_1,
                            estilo_estrutura_RecursoEstilo_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule exercicio
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_exercicio(Object[] objects) {
        estilo_estrutura_Estilos_1 = (estilo.estrutura.Estilos) objects[0];
        estilo_estrutura_RecursoEstilo_1 = (estilo.estrutura.RecursoEstilo) objects[1];
    }

    /**
     * Condition 0 of rule exercicio.<p>
     * The original expression was:<br>
     * <code>recurso instanceof Exercicio</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean exercicio_cond_0() {
        return (estilo_estrutura_RecursoEstilo_1 instanceof Exercicio);
    }

    /**
     * Checks whether some conditions of rule exercicio is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean exercicio_cond(int index) {
        switch (index) {
            case 0: return exercicio_cond_0();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule exercicio that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_exercicio(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            case 1:
                if (!exercicio_cond_0()) return false;
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
    private boolean checkCondForDeclaration_exercicio(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            case 1:
                return true;
            default: return false;
        }
    }

    /**
     * Executes the action part of the rule exercicio
     */
    private void exercicio() {
  		estilo_estrutura_Estilos_1.addItens("Verbal,Visual,Sequencial,Global,Sensorial,Intuitivo,Ativo,Reflexivo");
  		modified(estilo_estrutura_Estilos_1);
  		flush();		
      }



   
    /**
     * Identifiers of rule experimento
     */
    private String[] identifiers_experimento = {
        "estilos",
        "recurso"
    };

    /**
     * Returns the identifiers declared in rule experimento
     *
     * @return the identifiers declared in rule experimento
     */
    private String[] getDeclaredIdentifiers_experimento() {
         return identifiers_experimento;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule experimento.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_experimento(int index) {
        switch (index) {
            case 0: return "estilo.estrutura.Estilos";
            case 1: return "estilo.estrutura.RecursoEstilo";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule experimento.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_experimento(int index) {
        switch (index) {
            case 0: return estilo.estrutura.Estilos.class;
            case 1: return estilo.estrutura.RecursoEstilo.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule experimento.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_experimento(int index, Object value) {
        switch (index) {
            case 0: this.estilo_estrutura_Estilos_1 = (estilo.estrutura.Estilos) value; break;
            case 1: this.estilo_estrutura_RecursoEstilo_1 = (estilo.estrutura.RecursoEstilo) value; break;
        }
    }

    /**
     * Returns an object declared in the rule experimento.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_experimento(int index) {
        switch (index) {
            case 0: return estilo_estrutura_Estilos_1;
            case 1: return estilo_estrutura_RecursoEstilo_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule experimento
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_experimento() {
        return new Object[] {
                            estilo_estrutura_Estilos_1,
                            estilo_estrutura_RecursoEstilo_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule experimento
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_experimento(Object[] objects) {
        estilo_estrutura_Estilos_1 = (estilo.estrutura.Estilos) objects[0];
        estilo_estrutura_RecursoEstilo_1 = (estilo.estrutura.RecursoEstilo) objects[1];
    }

    /**
     * Condition 0 of rule experimento.<p>
     * The original expression was:<br>
     * <code>recurso instanceof Experimento</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean experimento_cond_0() {
        return (estilo_estrutura_RecursoEstilo_1 instanceof Experimento);
    }

    /**
     * Checks whether some conditions of rule experimento is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean experimento_cond(int index) {
        switch (index) {
            case 0: return experimento_cond_0();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule experimento that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_experimento(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            case 1:
                if (!experimento_cond_0()) return false;
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
    private boolean checkCondForDeclaration_experimento(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            case 1:
                return true;
            default: return false;
        }
    }

    /**
     * Executes the action part of the rule experimento
     */
    private void experimento() {
  		estilo_estrutura_Estilos_1.addItens("Visual,Global,Sensorial,Ativo");
  		modified(estilo_estrutura_Estilos_1);
  		flush();		
      }



   
    /**
     * Identifiers of rule figura
     */
    private String[] identifiers_figura = {
        "estilos",
        "recurso"
    };

    /**
     * Returns the identifiers declared in rule figura
     *
     * @return the identifiers declared in rule figura
     */
    private String[] getDeclaredIdentifiers_figura() {
         return identifiers_figura;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule figura.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_figura(int index) {
        switch (index) {
            case 0: return "estilo.estrutura.Estilos";
            case 1: return "estilo.estrutura.RecursoEstilo";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule figura.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_figura(int index) {
        switch (index) {
            case 0: return estilo.estrutura.Estilos.class;
            case 1: return estilo.estrutura.RecursoEstilo.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule figura.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_figura(int index, Object value) {
        switch (index) {
            case 0: this.estilo_estrutura_Estilos_1 = (estilo.estrutura.Estilos) value; break;
            case 1: this.estilo_estrutura_RecursoEstilo_1 = (estilo.estrutura.RecursoEstilo) value; break;
        }
    }

    /**
     * Returns an object declared in the rule figura.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_figura(int index) {
        switch (index) {
            case 0: return estilo_estrutura_Estilos_1;
            case 1: return estilo_estrutura_RecursoEstilo_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule figura
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_figura() {
        return new Object[] {
                            estilo_estrutura_Estilos_1,
                            estilo_estrutura_RecursoEstilo_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule figura
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_figura(Object[] objects) {
        estilo_estrutura_Estilos_1 = (estilo.estrutura.Estilos) objects[0];
        estilo_estrutura_RecursoEstilo_1 = (estilo.estrutura.RecursoEstilo) objects[1];
    }

    /**
     * Condition 0 of rule figura.<p>
     * The original expression was:<br>
     * <code>recurso instanceof Figura</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean figura_cond_0() {
        return (estilo_estrutura_RecursoEstilo_1 instanceof Figura);
    }

    /**
     * Checks whether some conditions of rule figura is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean figura_cond(int index) {
        switch (index) {
            case 0: return figura_cond_0();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule figura that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_figura(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            case 1:
                if (!figura_cond_0()) return false;
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
    private boolean checkCondForDeclaration_figura(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            case 1:
                return true;
            default: return false;
        }
    }

    /**
     * Executes the action part of the rule figura
     */
    private void figura() {
  		estilo_estrutura_Estilos_1.addItens("Visual,Sequencial,Global,Intuitivo,Ativo");
  		modified(estilo_estrutura_Estilos_1);
  		flush();		
      }



   
    /**
     * Identifiers of rule foto
     */
    private String[] identifiers_foto = {
        "estilos",
        "recurso"
    };

    /**
     * Returns the identifiers declared in rule foto
     *
     * @return the identifiers declared in rule foto
     */
    private String[] getDeclaredIdentifiers_foto() {
         return identifiers_foto;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule foto.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_foto(int index) {
        switch (index) {
            case 0: return "estilo.estrutura.Estilos";
            case 1: return "estilo.estrutura.RecursoEstilo";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule foto.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_foto(int index) {
        switch (index) {
            case 0: return estilo.estrutura.Estilos.class;
            case 1: return estilo.estrutura.RecursoEstilo.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule foto.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_foto(int index, Object value) {
        switch (index) {
            case 0: this.estilo_estrutura_Estilos_1 = (estilo.estrutura.Estilos) value; break;
            case 1: this.estilo_estrutura_RecursoEstilo_1 = (estilo.estrutura.RecursoEstilo) value; break;
        }
    }

    /**
     * Returns an object declared in the rule foto.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_foto(int index) {
        switch (index) {
            case 0: return estilo_estrutura_Estilos_1;
            case 1: return estilo_estrutura_RecursoEstilo_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule foto
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_foto() {
        return new Object[] {
                            estilo_estrutura_Estilos_1,
                            estilo_estrutura_RecursoEstilo_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule foto
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_foto(Object[] objects) {
        estilo_estrutura_Estilos_1 = (estilo.estrutura.Estilos) objects[0];
        estilo_estrutura_RecursoEstilo_1 = (estilo.estrutura.RecursoEstilo) objects[1];
    }

    /**
     * Condition 0 of rule foto.<p>
     * The original expression was:<br>
     * <code>recurso instanceof Foto</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean foto_cond_0() {
        return (estilo_estrutura_RecursoEstilo_1 instanceof Foto);
    }

    /**
     * Checks whether some conditions of rule foto is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean foto_cond(int index) {
        switch (index) {
            case 0: return foto_cond_0();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule foto that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_foto(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            case 1:
                if (!foto_cond_0()) return false;
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
    private boolean checkCondForDeclaration_foto(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            case 1:
                return true;
            default: return false;
        }
    }

    /**
     * Executes the action part of the rule foto
     */
    private void foto() {
  		estilo_estrutura_Estilos_1.addItens("Visual,Intuitivo");
  		modified(estilo_estrutura_Estilos_1);
  		flush();		
      }



   
    /**
     * Identifiers of rule grafico
     */
    private String[] identifiers_grafico = {
        "estilos",
        "recurso"
    };

    /**
     * Returns the identifiers declared in rule grafico
     *
     * @return the identifiers declared in rule grafico
     */
    private String[] getDeclaredIdentifiers_grafico() {
         return identifiers_grafico;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule grafico.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_grafico(int index) {
        switch (index) {
            case 0: return "estilo.estrutura.Estilos";
            case 1: return "estilo.estrutura.RecursoEstilo";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule grafico.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_grafico(int index) {
        switch (index) {
            case 0: return estilo.estrutura.Estilos.class;
            case 1: return estilo.estrutura.RecursoEstilo.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule grafico.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_grafico(int index, Object value) {
        switch (index) {
            case 0: this.estilo_estrutura_Estilos_1 = (estilo.estrutura.Estilos) value; break;
            case 1: this.estilo_estrutura_RecursoEstilo_1 = (estilo.estrutura.RecursoEstilo) value; break;
        }
    }

    /**
     * Returns an object declared in the rule grafico.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_grafico(int index) {
        switch (index) {
            case 0: return estilo_estrutura_Estilos_1;
            case 1: return estilo_estrutura_RecursoEstilo_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule grafico
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_grafico() {
        return new Object[] {
                            estilo_estrutura_Estilos_1,
                            estilo_estrutura_RecursoEstilo_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule grafico
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_grafico(Object[] objects) {
        estilo_estrutura_Estilos_1 = (estilo.estrutura.Estilos) objects[0];
        estilo_estrutura_RecursoEstilo_1 = (estilo.estrutura.RecursoEstilo) objects[1];
    }

    /**
     * Condition 0 of rule grafico.<p>
     * The original expression was:<br>
     * <code>recurso instanceof Grafico</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean grafico_cond_0() {
        return (estilo_estrutura_RecursoEstilo_1 instanceof Grafico);
    }

    /**
     * Checks whether some conditions of rule grafico is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean grafico_cond(int index) {
        switch (index) {
            case 0: return grafico_cond_0();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule grafico that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_grafico(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            case 1:
                if (!grafico_cond_0()) return false;
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
    private boolean checkCondForDeclaration_grafico(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            case 1:
                return true;
            default: return false;
        }
    }

    /**
     * Executes the action part of the rule grafico
     */
    private void grafico() {
  		estilo_estrutura_Estilos_1.addItens("Visual,Sequencial,Global,Sensorial,Intuitivo,Reflexivo");
  		modified(estilo_estrutura_Estilos_1);
  		flush();		
      }



   
    /**
     * Identifiers of rule mapa
     */
    private String[] identifiers_mapa = {
        "estilos",
        "recurso"
    };

    /**
     * Returns the identifiers declared in rule mapa
     *
     * @return the identifiers declared in rule mapa
     */
    private String[] getDeclaredIdentifiers_mapa() {
         return identifiers_mapa;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule mapa.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_mapa(int index) {
        switch (index) {
            case 0: return "estilo.estrutura.Estilos";
            case 1: return "estilo.estrutura.RecursoEstilo";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule mapa.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_mapa(int index) {
        switch (index) {
            case 0: return estilo.estrutura.Estilos.class;
            case 1: return estilo.estrutura.RecursoEstilo.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule mapa.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_mapa(int index, Object value) {
        switch (index) {
            case 0: this.estilo_estrutura_Estilos_1 = (estilo.estrutura.Estilos) value; break;
            case 1: this.estilo_estrutura_RecursoEstilo_1 = (estilo.estrutura.RecursoEstilo) value; break;
        }
    }

    /**
     * Returns an object declared in the rule mapa.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_mapa(int index) {
        switch (index) {
            case 0: return estilo_estrutura_Estilos_1;
            case 1: return estilo_estrutura_RecursoEstilo_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule mapa
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_mapa() {
        return new Object[] {
                            estilo_estrutura_Estilos_1,
                            estilo_estrutura_RecursoEstilo_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule mapa
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_mapa(Object[] objects) {
        estilo_estrutura_Estilos_1 = (estilo.estrutura.Estilos) objects[0];
        estilo_estrutura_RecursoEstilo_1 = (estilo.estrutura.RecursoEstilo) objects[1];
    }

    /**
     * Condition 0 of rule mapa.<p>
     * The original expression was:<br>
     * <code>recurso instanceof Mapa</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean mapa_cond_0() {
        return (estilo_estrutura_RecursoEstilo_1 instanceof Mapa);
    }

    /**
     * Checks whether some conditions of rule mapa is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean mapa_cond(int index) {
        switch (index) {
            case 0: return mapa_cond_0();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule mapa that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_mapa(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            case 1:
                if (!mapa_cond_0()) return false;
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
    private boolean checkCondForDeclaration_mapa(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            case 1:
                return true;
            default: return false;
        }
    }

    /**
     * Executes the action part of the rule mapa
     */
    private void mapa() {
  		estilo_estrutura_Estilos_1.addItens("Visual,Global,Sensorial,Ativo");
  		modified(estilo_estrutura_Estilos_1);
  		flush();		
      }



   
    /**
     * Identifiers of rule narracao
     */
    private String[] identifiers_narracao = {
        "estilos",
        "recurso"
    };

    /**
     * Returns the identifiers declared in rule narracao
     *
     * @return the identifiers declared in rule narracao
     */
    private String[] getDeclaredIdentifiers_narracao() {
         return identifiers_narracao;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule narracao.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_narracao(int index) {
        switch (index) {
            case 0: return "estilo.estrutura.Estilos";
            case 1: return "estilo.estrutura.RecursoEstilo";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule narracao.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_narracao(int index) {
        switch (index) {
            case 0: return estilo.estrutura.Estilos.class;
            case 1: return estilo.estrutura.RecursoEstilo.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule narracao.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_narracao(int index, Object value) {
        switch (index) {
            case 0: this.estilo_estrutura_Estilos_1 = (estilo.estrutura.Estilos) value; break;
            case 1: this.estilo_estrutura_RecursoEstilo_1 = (estilo.estrutura.RecursoEstilo) value; break;
        }
    }

    /**
     * Returns an object declared in the rule narracao.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_narracao(int index) {
        switch (index) {
            case 0: return estilo_estrutura_Estilos_1;
            case 1: return estilo_estrutura_RecursoEstilo_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule narracao
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_narracao() {
        return new Object[] {
                            estilo_estrutura_Estilos_1,
                            estilo_estrutura_RecursoEstilo_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule narracao
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_narracao(Object[] objects) {
        estilo_estrutura_Estilos_1 = (estilo.estrutura.Estilos) objects[0];
        estilo_estrutura_RecursoEstilo_1 = (estilo.estrutura.RecursoEstilo) objects[1];
    }

    /**
     * Condition 0 of rule narracao.<p>
     * The original expression was:<br>
     * <code>recurso instanceof Narracao</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean narracao_cond_0() {
        return (estilo_estrutura_RecursoEstilo_1 instanceof Narracao);
    }

    /**
     * Checks whether some conditions of rule narracao is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean narracao_cond(int index) {
        switch (index) {
            case 0: return narracao_cond_0();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule narracao that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_narracao(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            case 1:
                if (!narracao_cond_0()) return false;
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
    private boolean checkCondForDeclaration_narracao(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            case 1:
                return true;
            default: return false;
        }
    }

    /**
     * Executes the action part of the rule narracao
     */
    private void narracao() {
  		estilo_estrutura_Estilos_1.addItens("Verbal,Sequencial,Sensorial,Intuitivo");
  		modified(estilo_estrutura_Estilos_1);
  		flush();		
      }



   
    /**
     * Identifiers of rule paginaweb
     */
    private String[] identifiers_paginaweb = {
        "estilos",
        "recurso"
    };

    /**
     * Returns the identifiers declared in rule paginaweb
     *
     * @return the identifiers declared in rule paginaweb
     */
    private String[] getDeclaredIdentifiers_paginaweb() {
         return identifiers_paginaweb;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule paginaweb.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_paginaweb(int index) {
        switch (index) {
            case 0: return "estilo.estrutura.Estilos";
            case 1: return "estilo.estrutura.RecursoEstilo";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule paginaweb.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_paginaweb(int index) {
        switch (index) {
            case 0: return estilo.estrutura.Estilos.class;
            case 1: return estilo.estrutura.RecursoEstilo.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule paginaweb.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_paginaweb(int index, Object value) {
        switch (index) {
            case 0: this.estilo_estrutura_Estilos_1 = (estilo.estrutura.Estilos) value; break;
            case 1: this.estilo_estrutura_RecursoEstilo_1 = (estilo.estrutura.RecursoEstilo) value; break;
        }
    }

    /**
     * Returns an object declared in the rule paginaweb.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_paginaweb(int index) {
        switch (index) {
            case 0: return estilo_estrutura_Estilos_1;
            case 1: return estilo_estrutura_RecursoEstilo_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule paginaweb
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_paginaweb() {
        return new Object[] {
                            estilo_estrutura_Estilos_1,
                            estilo_estrutura_RecursoEstilo_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule paginaweb
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_paginaweb(Object[] objects) {
        estilo_estrutura_Estilos_1 = (estilo.estrutura.Estilos) objects[0];
        estilo_estrutura_RecursoEstilo_1 = (estilo.estrutura.RecursoEstilo) objects[1];
    }

    /**
     * Condition 0 of rule paginaweb.<p>
     * The original expression was:<br>
     * <code>recurso instanceof PaginaWeb</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean paginaweb_cond_0() {
        return (estilo_estrutura_RecursoEstilo_1 instanceof PaginaWeb);
    }

    /**
     * Checks whether some conditions of rule paginaweb is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean paginaweb_cond(int index) {
        switch (index) {
            case 0: return paginaweb_cond_0();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule paginaweb that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_paginaweb(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            case 1:
                if (!paginaweb_cond_0()) return false;
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
    private boolean checkCondForDeclaration_paginaweb(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            case 1:
                return true;
            default: return false;
        }
    }

    /**
     * Executes the action part of the rule paginaweb
     */
    private void paginaweb() {
  		estilo_estrutura_Estilos_1.addItens("Verbal,Visual,Sequencial,Global,Sensorial,Ativo,Reflexivo");
  		modified(estilo_estrutura_Estilos_1);
  		flush();		
      }



   
    /**
     * Identifiers of rule palestra
     */
    private String[] identifiers_palestra = {
        "estilos",
        "recurso"
    };

    /**
     * Returns the identifiers declared in rule palestra
     *
     * @return the identifiers declared in rule palestra
     */
    private String[] getDeclaredIdentifiers_palestra() {
         return identifiers_palestra;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule palestra.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_palestra(int index) {
        switch (index) {
            case 0: return "estilo.estrutura.Estilos";
            case 1: return "estilo.estrutura.RecursoEstilo";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule palestra.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_palestra(int index) {
        switch (index) {
            case 0: return estilo.estrutura.Estilos.class;
            case 1: return estilo.estrutura.RecursoEstilo.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule palestra.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_palestra(int index, Object value) {
        switch (index) {
            case 0: this.estilo_estrutura_Estilos_1 = (estilo.estrutura.Estilos) value; break;
            case 1: this.estilo_estrutura_RecursoEstilo_1 = (estilo.estrutura.RecursoEstilo) value; break;
        }
    }

    /**
     * Returns an object declared in the rule palestra.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_palestra(int index) {
        switch (index) {
            case 0: return estilo_estrutura_Estilos_1;
            case 1: return estilo_estrutura_RecursoEstilo_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule palestra
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_palestra() {
        return new Object[] {
                            estilo_estrutura_Estilos_1,
                            estilo_estrutura_RecursoEstilo_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule palestra
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_palestra(Object[] objects) {
        estilo_estrutura_Estilos_1 = (estilo.estrutura.Estilos) objects[0];
        estilo_estrutura_RecursoEstilo_1 = (estilo.estrutura.RecursoEstilo) objects[1];
    }

    /**
     * Condition 0 of rule palestra.<p>
     * The original expression was:<br>
     * <code>recurso instanceof Palestra</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean palestra_cond_0() {
        return (estilo_estrutura_RecursoEstilo_1 instanceof Palestra);
    }

    /**
     * Checks whether some conditions of rule palestra is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean palestra_cond(int index) {
        switch (index) {
            case 0: return palestra_cond_0();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule palestra that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_palestra(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            case 1:
                if (!palestra_cond_0()) return false;
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
    private boolean checkCondForDeclaration_palestra(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            case 1:
                return true;
            default: return false;
        }
    }

    /**
     * Executes the action part of the rule palestra
     */
    private void palestra() {
  		estilo_estrutura_Estilos_1.addItens("Verbal,Sequencial,Intuitivo,Reflexivo");
  		modified(estilo_estrutura_Estilos_1);
  		flush();		
      }



   
    /**
     * Identifiers of rule questionario
     */
    private String[] identifiers_questionario = {
        "estilos",
        "recurso"
    };

    /**
     * Returns the identifiers declared in rule questionario
     *
     * @return the identifiers declared in rule questionario
     */
    private String[] getDeclaredIdentifiers_questionario() {
         return identifiers_questionario;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule questionario.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_questionario(int index) {
        switch (index) {
            case 0: return "estilo.estrutura.Estilos";
            case 1: return "estilo.estrutura.RecursoEstilo";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule questionario.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_questionario(int index) {
        switch (index) {
            case 0: return estilo.estrutura.Estilos.class;
            case 1: return estilo.estrutura.RecursoEstilo.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule questionario.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_questionario(int index, Object value) {
        switch (index) {
            case 0: this.estilo_estrutura_Estilos_1 = (estilo.estrutura.Estilos) value; break;
            case 1: this.estilo_estrutura_RecursoEstilo_1 = (estilo.estrutura.RecursoEstilo) value; break;
        }
    }

    /**
     * Returns an object declared in the rule questionario.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_questionario(int index) {
        switch (index) {
            case 0: return estilo_estrutura_Estilos_1;
            case 1: return estilo_estrutura_RecursoEstilo_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule questionario
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_questionario() {
        return new Object[] {
                            estilo_estrutura_Estilos_1,
                            estilo_estrutura_RecursoEstilo_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule questionario
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_questionario(Object[] objects) {
        estilo_estrutura_Estilos_1 = (estilo.estrutura.Estilos) objects[0];
        estilo_estrutura_RecursoEstilo_1 = (estilo.estrutura.RecursoEstilo) objects[1];
    }

    /**
     * Condition 0 of rule questionario.<p>
     * The original expression was:<br>
     * <code>recurso instanceof Questionario</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean questionario_cond_0() {
        return (estilo_estrutura_RecursoEstilo_1 instanceof Questionario);
    }

    /**
     * Checks whether some conditions of rule questionario is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean questionario_cond(int index) {
        switch (index) {
            case 0: return questionario_cond_0();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule questionario that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_questionario(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            case 1:
                if (!questionario_cond_0()) return false;
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
    private boolean checkCondForDeclaration_questionario(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            case 1:
                return true;
            default: return false;
        }
    }

    /**
     * Executes the action part of the rule questionario
     */
    private void questionario() {
  		estilo_estrutura_Estilos_1.addItens("Verbal,Sequencial,Intuitivo");
  		modified(estilo_estrutura_Estilos_1);
  		flush();		
      }



   
    /**
     * Identifiers of rule simulacao
     */
    private String[] identifiers_simulacao = {
        "estilos",
        "recurso"
    };

    /**
     * Returns the identifiers declared in rule simulacao
     *
     * @return the identifiers declared in rule simulacao
     */
    private String[] getDeclaredIdentifiers_simulacao() {
         return identifiers_simulacao;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule simulacao.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_simulacao(int index) {
        switch (index) {
            case 0: return "estilo.estrutura.Estilos";
            case 1: return "estilo.estrutura.RecursoEstilo";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule simulacao.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_simulacao(int index) {
        switch (index) {
            case 0: return estilo.estrutura.Estilos.class;
            case 1: return estilo.estrutura.RecursoEstilo.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule simulacao.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_simulacao(int index, Object value) {
        switch (index) {
            case 0: this.estilo_estrutura_Estilos_1 = (estilo.estrutura.Estilos) value; break;
            case 1: this.estilo_estrutura_RecursoEstilo_1 = (estilo.estrutura.RecursoEstilo) value; break;
        }
    }

    /**
     * Returns an object declared in the rule simulacao.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_simulacao(int index) {
        switch (index) {
            case 0: return estilo_estrutura_Estilos_1;
            case 1: return estilo_estrutura_RecursoEstilo_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule simulacao
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_simulacao() {
        return new Object[] {
                            estilo_estrutura_Estilos_1,
                            estilo_estrutura_RecursoEstilo_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule simulacao
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_simulacao(Object[] objects) {
        estilo_estrutura_Estilos_1 = (estilo.estrutura.Estilos) objects[0];
        estilo_estrutura_RecursoEstilo_1 = (estilo.estrutura.RecursoEstilo) objects[1];
    }

    /**
     * Condition 0 of rule simulacao.<p>
     * The original expression was:<br>
     * <code>recurso instanceof Simulacao</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean simulacao_cond_0() {
        return (estilo_estrutura_RecursoEstilo_1 instanceof Simulacao);
    }

    /**
     * Checks whether some conditions of rule simulacao is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean simulacao_cond(int index) {
        switch (index) {
            case 0: return simulacao_cond_0();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule simulacao that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_simulacao(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            case 1:
                if (!simulacao_cond_0()) return false;
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
    private boolean checkCondForDeclaration_simulacao(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            case 1:
                return true;
            default: return false;
        }
    }

    /**
     * Executes the action part of the rule simulacao
     */
    private void simulacao() {
  		estilo_estrutura_Estilos_1.addItens("Visual,Sequencial,Intuitivo,Ativo,Reflexivo");
  		modified(estilo_estrutura_Estilos_1);
  		flush();		
      }



   
    /**
     * Identifiers of rule slide
     */
    private String[] identifiers_slide = {
        "estilos",
        "recurso"
    };

    /**
     * Returns the identifiers declared in rule slide
     *
     * @return the identifiers declared in rule slide
     */
    private String[] getDeclaredIdentifiers_slide() {
         return identifiers_slide;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule slide.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_slide(int index) {
        switch (index) {
            case 0: return "estilo.estrutura.Estilos";
            case 1: return "estilo.estrutura.RecursoEstilo";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule slide.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_slide(int index) {
        switch (index) {
            case 0: return estilo.estrutura.Estilos.class;
            case 1: return estilo.estrutura.RecursoEstilo.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule slide.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_slide(int index, Object value) {
        switch (index) {
            case 0: this.estilo_estrutura_Estilos_1 = (estilo.estrutura.Estilos) value; break;
            case 1: this.estilo_estrutura_RecursoEstilo_1 = (estilo.estrutura.RecursoEstilo) value; break;
        }
    }

    /**
     * Returns an object declared in the rule slide.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_slide(int index) {
        switch (index) {
            case 0: return estilo_estrutura_Estilos_1;
            case 1: return estilo_estrutura_RecursoEstilo_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule slide
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_slide() {
        return new Object[] {
                            estilo_estrutura_Estilos_1,
                            estilo_estrutura_RecursoEstilo_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule slide
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_slide(Object[] objects) {
        estilo_estrutura_Estilos_1 = (estilo.estrutura.Estilos) objects[0];
        estilo_estrutura_RecursoEstilo_1 = (estilo.estrutura.RecursoEstilo) objects[1];
    }

    /**
     * Condition 0 of rule slide.<p>
     * The original expression was:<br>
     * <code>recurso instanceof Slide</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean slide_cond_0() {
        return (estilo_estrutura_RecursoEstilo_1 instanceof Slide);
    }

    /**
     * Checks whether some conditions of rule slide is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean slide_cond(int index) {
        switch (index) {
            case 0: return slide_cond_0();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule slide that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_slide(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            case 1:
                if (!slide_cond_0()) return false;
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
    private boolean checkCondForDeclaration_slide(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            case 1:
                return true;
            default: return false;
        }
    }

    /**
     * Executes the action part of the rule slide
     */
    private void slide() {
  		estilo_estrutura_Estilos_1.addItens("Verbal,Visual,Sequencial,Global,Sensorial,Intuitivo");
  		modified(estilo_estrutura_Estilos_1);
  		flush();		
      }



   
    /**
     * Identifiers of rule tabela
     */
    private String[] identifiers_tabela = {
        "estilos",
        "recurso"
    };

    /**
     * Returns the identifiers declared in rule tabela
     *
     * @return the identifiers declared in rule tabela
     */
    private String[] getDeclaredIdentifiers_tabela() {
         return identifiers_tabela;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule tabela.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_tabela(int index) {
        switch (index) {
            case 0: return "estilo.estrutura.Estilos";
            case 1: return "estilo.estrutura.RecursoEstilo";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule tabela.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_tabela(int index) {
        switch (index) {
            case 0: return estilo.estrutura.Estilos.class;
            case 1: return estilo.estrutura.RecursoEstilo.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule tabela.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_tabela(int index, Object value) {
        switch (index) {
            case 0: this.estilo_estrutura_Estilos_1 = (estilo.estrutura.Estilos) value; break;
            case 1: this.estilo_estrutura_RecursoEstilo_1 = (estilo.estrutura.RecursoEstilo) value; break;
        }
    }

    /**
     * Returns an object declared in the rule tabela.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_tabela(int index) {
        switch (index) {
            case 0: return estilo_estrutura_Estilos_1;
            case 1: return estilo_estrutura_RecursoEstilo_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule tabela
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_tabela() {
        return new Object[] {
                            estilo_estrutura_Estilos_1,
                            estilo_estrutura_RecursoEstilo_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule tabela
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_tabela(Object[] objects) {
        estilo_estrutura_Estilos_1 = (estilo.estrutura.Estilos) objects[0];
        estilo_estrutura_RecursoEstilo_1 = (estilo.estrutura.RecursoEstilo) objects[1];
    }

    /**
     * Condition 0 of rule tabela.<p>
     * The original expression was:<br>
     * <code>recurso instanceof Tabela</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean tabela_cond_0() {
        return (estilo_estrutura_RecursoEstilo_1 instanceof Tabela);
    }

    /**
     * Checks whether some conditions of rule tabela is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean tabela_cond(int index) {
        switch (index) {
            case 0: return tabela_cond_0();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule tabela that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_tabela(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            case 1:
                if (!tabela_cond_0()) return false;
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
    private boolean checkCondForDeclaration_tabela(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            case 1:
                return true;
            default: return false;
        }
    }

    /**
     * Executes the action part of the rule tabela
     */
    private void tabela() {
  		estilo_estrutura_Estilos_1.addItens("Verbal,Visual,Sensorial,Reflexivo");
  		modified(estilo_estrutura_Estilos_1);
  		flush();		
      }



   
    /**
     * Identifiers of rule video
     */
    private String[] identifiers_video = {
        "estilos",
        "recurso"
    };

    /**
     * Returns the identifiers declared in rule video
     *
     * @return the identifiers declared in rule video
     */
    private String[] getDeclaredIdentifiers_video() {
         return identifiers_video;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule video.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_video(int index) {
        switch (index) {
            case 0: return "estilo.estrutura.Estilos";
            case 1: return "estilo.estrutura.RecursoEstilo";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule video.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_video(int index) {
        switch (index) {
            case 0: return estilo.estrutura.Estilos.class;
            case 1: return estilo.estrutura.RecursoEstilo.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule video.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_video(int index, Object value) {
        switch (index) {
            case 0: this.estilo_estrutura_Estilos_1 = (estilo.estrutura.Estilos) value; break;
            case 1: this.estilo_estrutura_RecursoEstilo_1 = (estilo.estrutura.RecursoEstilo) value; break;
        }
    }

    /**
     * Returns an object declared in the rule video.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_video(int index) {
        switch (index) {
            case 0: return estilo_estrutura_Estilos_1;
            case 1: return estilo_estrutura_RecursoEstilo_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule video
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_video() {
        return new Object[] {
                            estilo_estrutura_Estilos_1,
                            estilo_estrutura_RecursoEstilo_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule video
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_video(Object[] objects) {
        estilo_estrutura_Estilos_1 = (estilo.estrutura.Estilos) objects[0];
        estilo_estrutura_RecursoEstilo_1 = (estilo.estrutura.RecursoEstilo) objects[1];
    }

    /**
     * Condition 0 of rule video.<p>
     * The original expression was:<br>
     * <code>recurso instanceof Video</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean video_cond_0() {
        return (estilo_estrutura_RecursoEstilo_1 instanceof Video);
    }

    /**
     * Checks whether some conditions of rule video is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean video_cond(int index) {
        switch (index) {
            case 0: return video_cond_0();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule video that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_video(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            case 1:
                if (!video_cond_0()) return false;
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
    private boolean checkCondForDeclaration_video(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            case 1:
                return true;
            default: return false;
        }
    }

    /**
     * Executes the action part of the rule video
     */
    private void video() {
  		estilo_estrutura_Estilos_1.addItens("Visual,Sensorial,Ativo");
  		modified(estilo_estrutura_Estilos_1);
  		flush();		
      }


 
  

    /**
     * The names of the rules in this class file
     */
    private static final String[] File_ruleNames = {
        "animacao",
        "autoavaliacao",
        "demonstracao",
        "diagrama",
        "esquema",
        "exemplo",
        "exercicio",
        "experimento",
        "figura",
        "foto",
        "grafico",
        "mapa",
        "narracao",
        "paginaweb",
        "palestra",
        "questionario",
        "simulacao",
        "slide",
        "tabela",
        "video"
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
        2,
        2,
        2,
        2,
        2,
        2,
        2,
        2,
        2,
        2,
        2,
        2,
        2,
        2,
        2,
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
        1,
        1,
        1,
        1,
        1,
        1,
        1,
        1,
        1,
        1,
        1,
        1,
        1,
        1,
        1,
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
            case 0: return animacao_cond(condIndex);
            case 1: return autoavaliacao_cond(condIndex);
            case 2: return demonstracao_cond(condIndex);
            case 3: return diagrama_cond(condIndex);
            case 4: return esquema_cond(condIndex);
            case 5: return exemplo_cond(condIndex);
            case 6: return exercicio_cond(condIndex);
            case 7: return experimento_cond(condIndex);
            case 8: return figura_cond(condIndex);
            case 9: return foto_cond(condIndex);
            case 10: return grafico_cond(condIndex);
            case 11: return mapa_cond(condIndex);
            case 12: return narracao_cond(condIndex);
            case 13: return paginaweb_cond(condIndex);
            case 14: return palestra_cond(condIndex);
            case 15: return questionario_cond(condIndex);
            case 16: return simulacao_cond(condIndex);
            case 17: return slide_cond(condIndex);
            case 18: return tabela_cond(condIndex);
            case 19: return video_cond(condIndex);
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
            case 0: return checkConditionsOnlyOf_animacao(declIndex);
            case 1: return checkConditionsOnlyOf_autoavaliacao(declIndex);
            case 2: return checkConditionsOnlyOf_demonstracao(declIndex);
            case 3: return checkConditionsOnlyOf_diagrama(declIndex);
            case 4: return checkConditionsOnlyOf_esquema(declIndex);
            case 5: return checkConditionsOnlyOf_exemplo(declIndex);
            case 6: return checkConditionsOnlyOf_exercicio(declIndex);
            case 7: return checkConditionsOnlyOf_experimento(declIndex);
            case 8: return checkConditionsOnlyOf_figura(declIndex);
            case 9: return checkConditionsOnlyOf_foto(declIndex);
            case 10: return checkConditionsOnlyOf_grafico(declIndex);
            case 11: return checkConditionsOnlyOf_mapa(declIndex);
            case 12: return checkConditionsOnlyOf_narracao(declIndex);
            case 13: return checkConditionsOnlyOf_paginaweb(declIndex);
            case 14: return checkConditionsOnlyOf_palestra(declIndex);
            case 15: return checkConditionsOnlyOf_questionario(declIndex);
            case 16: return checkConditionsOnlyOf_simulacao(declIndex);
            case 17: return checkConditionsOnlyOf_slide(declIndex);
            case 18: return checkConditionsOnlyOf_tabela(declIndex);
            case 19: return checkConditionsOnlyOf_video(declIndex);
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
            case 0: return checkCondForDeclaration_animacao(declIndex);
            case 1: return checkCondForDeclaration_autoavaliacao(declIndex);
            case 2: return checkCondForDeclaration_demonstracao(declIndex);
            case 3: return checkCondForDeclaration_diagrama(declIndex);
            case 4: return checkCondForDeclaration_esquema(declIndex);
            case 5: return checkCondForDeclaration_exemplo(declIndex);
            case 6: return checkCondForDeclaration_exercicio(declIndex);
            case 7: return checkCondForDeclaration_experimento(declIndex);
            case 8: return checkCondForDeclaration_figura(declIndex);
            case 9: return checkCondForDeclaration_foto(declIndex);
            case 10: return checkCondForDeclaration_grafico(declIndex);
            case 11: return checkCondForDeclaration_mapa(declIndex);
            case 12: return checkCondForDeclaration_narracao(declIndex);
            case 13: return checkCondForDeclaration_paginaweb(declIndex);
            case 14: return checkCondForDeclaration_palestra(declIndex);
            case 15: return checkCondForDeclaration_questionario(declIndex);
            case 16: return checkCondForDeclaration_simulacao(declIndex);
            case 17: return checkCondForDeclaration_slide(declIndex);
            case 18: return checkCondForDeclaration_tabela(declIndex);
            case 19: return checkCondForDeclaration_video(declIndex);
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
            case 0: return getDeclaredClassName_animacao(declIndex);
            case 1: return getDeclaredClassName_autoavaliacao(declIndex);
            case 2: return getDeclaredClassName_demonstracao(declIndex);
            case 3: return getDeclaredClassName_diagrama(declIndex);
            case 4: return getDeclaredClassName_esquema(declIndex);
            case 5: return getDeclaredClassName_exemplo(declIndex);
            case 6: return getDeclaredClassName_exercicio(declIndex);
            case 7: return getDeclaredClassName_experimento(declIndex);
            case 8: return getDeclaredClassName_figura(declIndex);
            case 9: return getDeclaredClassName_foto(declIndex);
            case 10: return getDeclaredClassName_grafico(declIndex);
            case 11: return getDeclaredClassName_mapa(declIndex);
            case 12: return getDeclaredClassName_narracao(declIndex);
            case 13: return getDeclaredClassName_paginaweb(declIndex);
            case 14: return getDeclaredClassName_palestra(declIndex);
            case 15: return getDeclaredClassName_questionario(declIndex);
            case 16: return getDeclaredClassName_simulacao(declIndex);
            case 17: return getDeclaredClassName_slide(declIndex);
            case 18: return getDeclaredClassName_tabela(declIndex);
            case 19: return getDeclaredClassName_video(declIndex);
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
            case 0: return getDeclaredClass_animacao(declIndex);
            case 1: return getDeclaredClass_autoavaliacao(declIndex);
            case 2: return getDeclaredClass_demonstracao(declIndex);
            case 3: return getDeclaredClass_diagrama(declIndex);
            case 4: return getDeclaredClass_esquema(declIndex);
            case 5: return getDeclaredClass_exemplo(declIndex);
            case 6: return getDeclaredClass_exercicio(declIndex);
            case 7: return getDeclaredClass_experimento(declIndex);
            case 8: return getDeclaredClass_figura(declIndex);
            case 9: return getDeclaredClass_foto(declIndex);
            case 10: return getDeclaredClass_grafico(declIndex);
            case 11: return getDeclaredClass_mapa(declIndex);
            case 12: return getDeclaredClass_narracao(declIndex);
            case 13: return getDeclaredClass_paginaweb(declIndex);
            case 14: return getDeclaredClass_palestra(declIndex);
            case 15: return getDeclaredClass_questionario(declIndex);
            case 16: return getDeclaredClass_simulacao(declIndex);
            case 17: return getDeclaredClass_slide(declIndex);
            case 18: return getDeclaredClass_tabela(declIndex);
            case 19: return getDeclaredClass_video(declIndex);
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
            case 0: animacao(); break;
            case 1: autoavaliacao(); break;
            case 2: demonstracao(); break;
            case 3: diagrama(); break;
            case 4: esquema(); break;
            case 5: exemplo(); break;
            case 6: exercicio(); break;
            case 7: experimento(); break;
            case 8: figura(); break;
            case 9: foto(); break;
            case 10: grafico(); break;
            case 11: mapa(); break;
            case 12: narracao(); break;
            case 13: paginaweb(); break;
            case 14: palestra(); break;
            case 15: questionario(); break;
            case 16: simulacao(); break;
            case 17: slide(); break;
            case 18: tabela(); break;
            case 19: video(); break;
        }
    }

    /**
     * Returns the number of rules.
     *
     * @return the number of rules.
     */
    public int getNumberOfRules() {
        return 20;
    }

    /**
     * Returns the identifiers declared in a given rule.
     *
     * @param ruleIndex the index of the rule.
     * @return an array with the identifiers of the rule declarations.
     */
    public String[] getDeclaredIdentifiers(int ruleIndex) {
        switch (ruleIndex) {
            case 0: return getDeclaredIdentifiers_animacao();
            case 1: return getDeclaredIdentifiers_autoavaliacao();
            case 2: return getDeclaredIdentifiers_demonstracao();
            case 3: return getDeclaredIdentifiers_diagrama();
            case 4: return getDeclaredIdentifiers_esquema();
            case 5: return getDeclaredIdentifiers_exemplo();
            case 6: return getDeclaredIdentifiers_exercicio();
            case 7: return getDeclaredIdentifiers_experimento();
            case 8: return getDeclaredIdentifiers_figura();
            case 9: return getDeclaredIdentifiers_foto();
            case 10: return getDeclaredIdentifiers_grafico();
            case 11: return getDeclaredIdentifiers_mapa();
            case 12: return getDeclaredIdentifiers_narracao();
            case 13: return getDeclaredIdentifiers_paginaweb();
            case 14: return getDeclaredIdentifiers_palestra();
            case 15: return getDeclaredIdentifiers_questionario();
            case 16: return getDeclaredIdentifiers_simulacao();
            case 17: return getDeclaredIdentifiers_slide();
            case 18: return getDeclaredIdentifiers_tabela();
            case 19: return getDeclaredIdentifiers_video();
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
            case 0: setObject_animacao(declIndex, value); break;
            case 1: setObject_autoavaliacao(declIndex, value); break;
            case 2: setObject_demonstracao(declIndex, value); break;
            case 3: setObject_diagrama(declIndex, value); break;
            case 4: setObject_esquema(declIndex, value); break;
            case 5: setObject_exemplo(declIndex, value); break;
            case 6: setObject_exercicio(declIndex, value); break;
            case 7: setObject_experimento(declIndex, value); break;
            case 8: setObject_figura(declIndex, value); break;
            case 9: setObject_foto(declIndex, value); break;
            case 10: setObject_grafico(declIndex, value); break;
            case 11: setObject_mapa(declIndex, value); break;
            case 12: setObject_narracao(declIndex, value); break;
            case 13: setObject_paginaweb(declIndex, value); break;
            case 14: setObject_palestra(declIndex, value); break;
            case 15: setObject_questionario(declIndex, value); break;
            case 16: setObject_simulacao(declIndex, value); break;
            case 17: setObject_slide(declIndex, value); break;
            case 18: setObject_tabela(declIndex, value); break;
            case 19: setObject_video(declIndex, value); break;
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
            case 0: return getObject_animacao(declIndex);
            case 1: return getObject_autoavaliacao(declIndex);
            case 2: return getObject_demonstracao(declIndex);
            case 3: return getObject_diagrama(declIndex);
            case 4: return getObject_esquema(declIndex);
            case 5: return getObject_exemplo(declIndex);
            case 6: return getObject_exercicio(declIndex);
            case 7: return getObject_experimento(declIndex);
            case 8: return getObject_figura(declIndex);
            case 9: return getObject_foto(declIndex);
            case 10: return getObject_grafico(declIndex);
            case 11: return getObject_mapa(declIndex);
            case 12: return getObject_narracao(declIndex);
            case 13: return getObject_paginaweb(declIndex);
            case 14: return getObject_palestra(declIndex);
            case 15: return getObject_questionario(declIndex);
            case 16: return getObject_simulacao(declIndex);
            case 17: return getObject_slide(declIndex);
            case 18: return getObject_tabela(declIndex);
            case 19: return getObject_video(declIndex);
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
            case 0: return getObjects_animacao();
            case 1: return getObjects_autoavaliacao();
            case 2: return getObjects_demonstracao();
            case 3: return getObjects_diagrama();
            case 4: return getObjects_esquema();
            case 5: return getObjects_exemplo();
            case 6: return getObjects_exercicio();
            case 7: return getObjects_experimento();
            case 8: return getObjects_figura();
            case 9: return getObjects_foto();
            case 10: return getObjects_grafico();
            case 11: return getObjects_mapa();
            case 12: return getObjects_narracao();
            case 13: return getObjects_paginaweb();
            case 14: return getObjects_palestra();
            case 15: return getObjects_questionario();
            case 16: return getObjects_simulacao();
            case 17: return getObjects_slide();
            case 18: return getObjects_tabela();
            case 19: return getObjects_video();
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
            case 0: setObjects_animacao(objects); break;
            case 1: setObjects_autoavaliacao(objects); break;
            case 2: setObjects_demonstracao(objects); break;
            case 3: setObjects_diagrama(objects); break;
            case 4: setObjects_esquema(objects); break;
            case 5: setObjects_exemplo(objects); break;
            case 6: setObjects_exercicio(objects); break;
            case 7: setObjects_experimento(objects); break;
            case 8: setObjects_figura(objects); break;
            case 9: setObjects_foto(objects); break;
            case 10: setObjects_grafico(objects); break;
            case 11: setObjects_mapa(objects); break;
            case 12: setObjects_narracao(objects); break;
            case 13: setObjects_paginaweb(objects); break;
            case 14: setObjects_palestra(objects); break;
            case 15: setObjects_questionario(objects); break;
            case 16: setObjects_simulacao(objects); break;
            case 17: setObjects_slide(objects); break;
            case 18: setObjects_tabela(objects); break;
            case 19: setObjects_video(objects); break;
        }
    }

    /*
     * The variables declared in the rules.
     */
    private estilo.estrutura.Estilos estilo_estrutura_Estilos_1;
    private estilo.estrutura.RecursoEstilo estilo_estrutura_RecursoEstilo_1;

    /**
     * Class constructor.
     *
     * @param knowledgeBase the knowledge base that contains this rule base.
     */
    public Jeops_RuleBase_RecursosKB(jeops.AbstractKnowledgeBase knowledgeBase) {
        super(knowledgeBase);
    }

}
/**
 * Knowledge base created by JEOPS from file RecursosKB.rules
 *
 * @version 21/10/2015
 */
public class RecursosKB extends jeops.AbstractKnowledgeBase {

    /**
     * Creates a new knowledge base with the specified conflict set with the
     * desired conflict resolution policy.
     *
     * @param conflictSet a conflict set with the desired resolution policy
     */
    public RecursosKB(jeops.conflict.ConflictSet conflictSet) {
        super(conflictSet);
    }

    /**
     * Creates a new knowledge base, using the default conflict resolution
     * policy.
     */
    public RecursosKB() {
        this(new jeops.conflict.DefaultConflictSet());
    }

    /**
     * Factory method used to instantiate the rule base.
     */
    protected jeops.AbstractRuleBase createRuleBase() {
        return new Jeops_RuleBase_RecursosKB(this);
    }

}
