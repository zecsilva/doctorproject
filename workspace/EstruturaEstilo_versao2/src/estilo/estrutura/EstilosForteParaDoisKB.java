package estilo.estrutura;

import estilo.recursos.*;
import java.util.*;

  class Jeops_RuleBase_EstilosForteParaDoisKB
extends jeops.AbstractRuleBase {

  
    /**
     * Identifiers of rule estilosAtivoVerbal
     */
    private String[] identifiers_estilosAtivoVerbal = {
        "e1",
        "e2"
    };

    /**
     * Returns the identifiers declared in rule estilosAtivoVerbal
     *
     * @return the identifiers declared in rule estilosAtivoVerbal
     */
    private String[] getDeclaredIdentifiers_estilosAtivoVerbal() {
         return identifiers_estilosAtivoVerbal;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule estilosAtivoVerbal.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_estilosAtivoVerbal(int index) {
        switch (index) {
            case 0: return "estilo.estrutura.Estilo";
            case 1: return "estilo.estrutura.Estilo";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule estilosAtivoVerbal.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_estilosAtivoVerbal(int index) {
        switch (index) {
            case 0: return estilo.estrutura.Estilo.class;
            case 1: return estilo.estrutura.Estilo.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule estilosAtivoVerbal.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_estilosAtivoVerbal(int index, Object value) {
        switch (index) {
            case 0: this.estilo_estrutura_Estilo_1 = (estilo.estrutura.Estilo) value; break;
            case 1: this.estilo_estrutura_Estilo_2 = (estilo.estrutura.Estilo) value; break;
        }
    }

    /**
     * Returns an object declared in the rule estilosAtivoVerbal.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_estilosAtivoVerbal(int index) {
        switch (index) {
            case 0: return estilo_estrutura_Estilo_1;
            case 1: return estilo_estrutura_Estilo_2;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule estilosAtivoVerbal
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_estilosAtivoVerbal() {
        return new Object[] {
                            estilo_estrutura_Estilo_1,
                            estilo_estrutura_Estilo_2
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule estilosAtivoVerbal
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_estilosAtivoVerbal(Object[] objects) {
        estilo_estrutura_Estilo_1 = (estilo.estrutura.Estilo) objects[0];
        estilo_estrutura_Estilo_2 = (estilo.estrutura.Estilo) objects[1];
    }

    /**
     * Condition 0 of rule estilosAtivoVerbal.<p>
     * The original expression was:<br>
     * <code>e1.getEstiloNome().equalsIgnoreCase("Ativo")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean estilosAtivoVerbal_cond_0() {
        return (estilo_estrutura_Estilo_1.getEstiloNome().equalsIgnoreCase("Ativo"));
    }

    /**
     * Condition 1 of rule estilosAtivoVerbal.<p>
     * The original expression was:<br>
     * <code>e2.getEstiloNome().equalsIgnoreCase("Verbal")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean estilosAtivoVerbal_cond_1() {
        return (estilo_estrutura_Estilo_2.getEstiloNome().equalsIgnoreCase("Verbal"));
    }

    /**
     * Checks whether some conditions of rule estilosAtivoVerbal is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean estilosAtivoVerbal_cond(int index) {
        switch (index) {
            case 0: return estilosAtivoVerbal_cond_0();
            case 1: return estilosAtivoVerbal_cond_1();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule estilosAtivoVerbal that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_estilosAtivoVerbal(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!estilosAtivoVerbal_cond_0()) return false;
                return true;
            case 1:
                if (!estilosAtivoVerbal_cond_1()) return false;
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
    private boolean checkCondForDeclaration_estilosAtivoVerbal(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            case 1:
                return true;
            default: return false;
        }
    }

    /**
     * Executes the action part of the rule estilosAtivoVerbal
     */
    private void estilosAtivoVerbal() {
	  System.out.println(" Ativou a regra para os estilos Ativo e Verbal");
	  
	  OrdemComposicao ordemComposicao1 = new OrdemComposicao();
	  ordemComposicao1.getOrdem().add(new EtapaConteudo("Introdução"));
	  ordemComposicao1.getOrdem().add(new EtapaConteudo("Desenvolvimento"));
	  ordemComposicao1.getOrdem().add(new EtapaConteudo("Atividade"));
	  ordemComposicao1.getOrdem().add(new EtapaConteudo("Resumo"));
	  ordemComposicao1.getOrdem().add(new EtapaConteudo("Avaliação"));
	  
	  OrdemComposicao ordemComposicao2 = new OrdemComposicao();
	  ordemComposicao2.getOrdem().add(new EtapaConteudo("Resumo"));
	  ordemComposicao2.getOrdem().add(new EtapaConteudo("Introdução"));
	  ordemComposicao2.getOrdem().add(new EtapaConteudo("Desenvolvimento"));
	  ordemComposicao2.getOrdem().add(new EtapaConteudo("Atividade"));
	  ordemComposicao2.getOrdem().add(new EtapaConteudo("Avaliação"));

	  ArrayList<RecursoEstilo> recursos = new ArrayList<RecursoEstilo>();
	  recursos.add(new Diagrama());
	  recursos.add(new Narracao());
	  recursos.add(new Palestra());
	  recursos.add(new Slide());
	  recursos.add(new AutoAvaliacao());
	  recursos.add(new Tabela());
	  recursos.add(new Exercicio());
	  recursos.add(new Questionario());
	  recursos.add(new PaginaWeb());
	  recursos.add(new Demonstracao());
	  recursos.add(new Exemplo());
	  estilo_estrutura_Estilo_1.setRecursos(recursos);
	  estilo_estrutura_Estilo_2.setRecursos(recursos);
	  
	  
	  estilo_estrutura_Estilo_1.setFormaExploracao(new FormaExploracao("Rede"));
	  estilo_estrutura_Estilo_1.setOrdemDetalhamento(new OrdemDetalhamento("Geral para Específico"));
	  estilo_estrutura_Estilo_1.setOrdemComposicao(ordemComposicao1);
	  modified(estilo_estrutura_Estilo_1);
	  
	  estilo_estrutura_Estilo_2.setFormaExploracao(new FormaExploracao("Linear"));
	  estilo_estrutura_Estilo_2.setOrdemDetalhamento(new OrdemDetalhamento("Específico para geral"));
	  estilo_estrutura_Estilo_2.setOrdemComposicao(ordemComposicao2);
	  modified(estilo_estrutura_Estilo_2);
	  
	  flush();
  
      }



  
    /**
     * Identifiers of rule estilosAtivoVisual
     */
    private String[] identifiers_estilosAtivoVisual = {
        "e1",
        "e2"
    };

    /**
     * Returns the identifiers declared in rule estilosAtivoVisual
     *
     * @return the identifiers declared in rule estilosAtivoVisual
     */
    private String[] getDeclaredIdentifiers_estilosAtivoVisual() {
         return identifiers_estilosAtivoVisual;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule estilosAtivoVisual.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_estilosAtivoVisual(int index) {
        switch (index) {
            case 0: return "estilo.estrutura.Estilo";
            case 1: return "estilo.estrutura.Estilo";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule estilosAtivoVisual.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_estilosAtivoVisual(int index) {
        switch (index) {
            case 0: return estilo.estrutura.Estilo.class;
            case 1: return estilo.estrutura.Estilo.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule estilosAtivoVisual.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_estilosAtivoVisual(int index, Object value) {
        switch (index) {
            case 0: this.estilo_estrutura_Estilo_1 = (estilo.estrutura.Estilo) value; break;
            case 1: this.estilo_estrutura_Estilo_2 = (estilo.estrutura.Estilo) value; break;
        }
    }

    /**
     * Returns an object declared in the rule estilosAtivoVisual.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_estilosAtivoVisual(int index) {
        switch (index) {
            case 0: return estilo_estrutura_Estilo_1;
            case 1: return estilo_estrutura_Estilo_2;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule estilosAtivoVisual
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_estilosAtivoVisual() {
        return new Object[] {
                            estilo_estrutura_Estilo_1,
                            estilo_estrutura_Estilo_2
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule estilosAtivoVisual
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_estilosAtivoVisual(Object[] objects) {
        estilo_estrutura_Estilo_1 = (estilo.estrutura.Estilo) objects[0];
        estilo_estrutura_Estilo_2 = (estilo.estrutura.Estilo) objects[1];
    }

    /**
     * Condition 0 of rule estilosAtivoVisual.<p>
     * The original expression was:<br>
     * <code>e1.getEstiloNome().equalsIgnoreCase("Ativo")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean estilosAtivoVisual_cond_0() {
        return (estilo_estrutura_Estilo_1.getEstiloNome().equalsIgnoreCase("Ativo"));
    }

    /**
     * Condition 1 of rule estilosAtivoVisual.<p>
     * The original expression was:<br>
     * <code>e2.getEstiloNome().equalsIgnoreCase("Visual")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean estilosAtivoVisual_cond_1() {
        return (estilo_estrutura_Estilo_2.getEstiloNome().equalsIgnoreCase("Visual"));
    }

    /**
     * Checks whether some conditions of rule estilosAtivoVisual is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean estilosAtivoVisual_cond(int index) {
        switch (index) {
            case 0: return estilosAtivoVisual_cond_0();
            case 1: return estilosAtivoVisual_cond_1();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule estilosAtivoVisual that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_estilosAtivoVisual(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!estilosAtivoVisual_cond_0()) return false;
                return true;
            case 1:
                if (!estilosAtivoVisual_cond_1()) return false;
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
    private boolean checkCondForDeclaration_estilosAtivoVisual(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            case 1:
                return true;
            default: return false;
        }
    }

    /**
     * Executes the action part of the rule estilosAtivoVisual
     */
    private void estilosAtivoVisual() {
	  System.out.println(" Ativou a regra para os estilos Ativo e Visual");
	  
	  OrdemComposicao ordemComposicao1 = new OrdemComposicao();
	  ordemComposicao1.getOrdem().add(new EtapaConteudo("Introdução"));
	  ordemComposicao1.getOrdem().add(new EtapaConteudo("Desenvolvimento"));
	  ordemComposicao1.getOrdem().add(new EtapaConteudo("Atividade"));
	  ordemComposicao1.getOrdem().add(new EtapaConteudo("Resumo"));
	  ordemComposicao1.getOrdem().add(new EtapaConteudo("Avaliação"));
	  
	  OrdemComposicao ordemComposicao2 = new OrdemComposicao();
	  ordemComposicao2.getOrdem().add(new EtapaConteudo("Resumo"));
	  ordemComposicao2.getOrdem().add(new EtapaConteudo("Introdução"));
	  ordemComposicao2.getOrdem().add(new EtapaConteudo("Desenvolvimento"));
	  ordemComposicao2.getOrdem().add(new EtapaConteudo("Atividade"));
	  ordemComposicao2.getOrdem().add(new EtapaConteudo("Avaliação"));

	  ArrayList<RecursoEstilo> recursos = new ArrayList<RecursoEstilo>();
	  recursos.add(new Video());
	  recursos.add(new Diagrama());
	  recursos.add(new Grafico());
	  recursos.add(new Figura());
	  recursos.add(new Slide());
	  recursos.add(new AutoAvaliacao());
	  recursos.add(new Tabela());
	  recursos.add(new Experimento());
	  recursos.add(new Exercicio());
	  recursos.add(new Simulacao());
	  recursos.add(new Animacao());
	  recursos.add(new Foto());
	  recursos.add(new PaginaWeb());
	  recursos.add(new Mapa());
	  recursos.add(new Demonstracao());
	  recursos.add(new Exemplo());
	  estilo_estrutura_Estilo_1.setRecursos(recursos);
	  estilo_estrutura_Estilo_2.setRecursos(recursos);
	  
	  estilo_estrutura_Estilo_1.setFormaExploracao(new FormaExploracao("Rede"));
	  estilo_estrutura_Estilo_1.setOrdemDetalhamento(new OrdemDetalhamento("Geral para Específico"));
	  estilo_estrutura_Estilo_1.setOrdemComposicao(ordemComposicao1);
	  modified(estilo_estrutura_Estilo_1);
	  
	  estilo_estrutura_Estilo_2.setFormaExploracao(new FormaExploracao("Rede"));
	  estilo_estrutura_Estilo_2.setOrdemDetalhamento(new OrdemDetalhamento("Geral para Específico"));
	  estilo_estrutura_Estilo_2.setOrdemComposicao(ordemComposicao2);
	  modified(estilo_estrutura_Estilo_2);
	  	  
	  flush();
  
      }


  

  
    /**
     * Identifiers of rule estilosAtivoSequencial
     */
    private String[] identifiers_estilosAtivoSequencial = {
        "e1",
        "e2"
    };

    /**
     * Returns the identifiers declared in rule estilosAtivoSequencial
     *
     * @return the identifiers declared in rule estilosAtivoSequencial
     */
    private String[] getDeclaredIdentifiers_estilosAtivoSequencial() {
         return identifiers_estilosAtivoSequencial;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule estilosAtivoSequencial.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_estilosAtivoSequencial(int index) {
        switch (index) {
            case 0: return "estilo.estrutura.Estilo";
            case 1: return "estilo.estrutura.Estilo";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule estilosAtivoSequencial.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_estilosAtivoSequencial(int index) {
        switch (index) {
            case 0: return estilo.estrutura.Estilo.class;
            case 1: return estilo.estrutura.Estilo.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule estilosAtivoSequencial.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_estilosAtivoSequencial(int index, Object value) {
        switch (index) {
            case 0: this.estilo_estrutura_Estilo_1 = (estilo.estrutura.Estilo) value; break;
            case 1: this.estilo_estrutura_Estilo_2 = (estilo.estrutura.Estilo) value; break;
        }
    }

    /**
     * Returns an object declared in the rule estilosAtivoSequencial.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_estilosAtivoSequencial(int index) {
        switch (index) {
            case 0: return estilo_estrutura_Estilo_1;
            case 1: return estilo_estrutura_Estilo_2;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule estilosAtivoSequencial
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_estilosAtivoSequencial() {
        return new Object[] {
                            estilo_estrutura_Estilo_1,
                            estilo_estrutura_Estilo_2
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule estilosAtivoSequencial
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_estilosAtivoSequencial(Object[] objects) {
        estilo_estrutura_Estilo_1 = (estilo.estrutura.Estilo) objects[0];
        estilo_estrutura_Estilo_2 = (estilo.estrutura.Estilo) objects[1];
    }

    /**
     * Condition 0 of rule estilosAtivoSequencial.<p>
     * The original expression was:<br>
     * <code>e1.getEstiloNome().equalsIgnoreCase("Ativo")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean estilosAtivoSequencial_cond_0() {
        return (estilo_estrutura_Estilo_1.getEstiloNome().equalsIgnoreCase("Ativo"));
    }

    /**
     * Condition 1 of rule estilosAtivoSequencial.<p>
     * The original expression was:<br>
     * <code>e2.getEstiloNome().equalsIgnoreCase("Sequencial")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean estilosAtivoSequencial_cond_1() {
        return (estilo_estrutura_Estilo_2.getEstiloNome().equalsIgnoreCase("Sequencial"));
    }

    /**
     * Checks whether some conditions of rule estilosAtivoSequencial is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean estilosAtivoSequencial_cond(int index) {
        switch (index) {
            case 0: return estilosAtivoSequencial_cond_0();
            case 1: return estilosAtivoSequencial_cond_1();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule estilosAtivoSequencial that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_estilosAtivoSequencial(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!estilosAtivoSequencial_cond_0()) return false;
                return true;
            case 1:
                if (!estilosAtivoSequencial_cond_1()) return false;
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
    private boolean checkCondForDeclaration_estilosAtivoSequencial(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            case 1:
                return true;
            default: return false;
        }
    }

    /**
     * Executes the action part of the rule estilosAtivoSequencial
     */
    private void estilosAtivoSequencial() {
	  System.out.println(" Ativou a regra para os estilos Ativo e Sequencial");
	  
	  OrdemComposicao ordemComposicao1 = new OrdemComposicao();
	  ordemComposicao1.getOrdem().add(new EtapaConteudo("Introdução"));
	  ordemComposicao1.getOrdem().add(new EtapaConteudo("Desenvolvimento"));
	  ordemComposicao1.getOrdem().add(new EtapaConteudo("Atividade"));
	  ordemComposicao1.getOrdem().add(new EtapaConteudo("Resumo"));
	  ordemComposicao1.getOrdem().add(new EtapaConteudo("Avaliação"));
	  
	  OrdemComposicao ordemComposicao2 = new OrdemComposicao();

	  ordemComposicao2.getOrdem().add(new EtapaConteudo("Introdução"));
	  ordemComposicao2.getOrdem().add(new EtapaConteudo("Desenvolvimento"));
	  ordemComposicao2.getOrdem().add(new EtapaConteudo("Atividade"));
	  ordemComposicao2.getOrdem().add(new EtapaConteudo("Resumo"));
	  ordemComposicao2.getOrdem().add(new EtapaConteudo("Avaliação"));

	  ArrayList<RecursoEstilo> recursos = new ArrayList<RecursoEstilo>();
	  recursos.add(new Video());
	  recursos.add(new Diagrama());
	  recursos.add(new Grafico());
	  recursos.add(new Figura());
	  recursos.add(new Narracao());
	  recursos.add(new Palestra());
	  recursos.add(new Slide());
	  recursos.add(new AutoAvaliacao());
	  recursos.add(new Exercicio());
	  recursos.add(new Simulacao());
	  recursos.add(new Questionario());
	  recursos.add(new Esquema());
	  recursos.add(new Animacao());	  	  	  	  
	  recursos.add(new PaginaWeb());
	  recursos.add(new Demonstracao());
	  recursos.add(new Mapa());
	  recursos.add(new Exemplo());
	  estilo_estrutura_Estilo_1.setRecursos(recursos);
	  estilo_estrutura_Estilo_2.setRecursos(recursos);
	  
	  estilo_estrutura_Estilo_1.setFormaExploracao(new FormaExploracao("Rede"));
	  estilo_estrutura_Estilo_1.setOrdemDetalhamento(new OrdemDetalhamento("Geral para Específico"));
	  estilo_estrutura_Estilo_1.setOrdemComposicao(ordemComposicao1);
	  modified(estilo_estrutura_Estilo_1);
	  
	  estilo_estrutura_Estilo_2.setFormaExploracao(new FormaExploracao("Linear"));
	  estilo_estrutura_Estilo_2.setOrdemDetalhamento(new OrdemDetalhamento("Específico para geral"));
	  estilo_estrutura_Estilo_2.setOrdemComposicao(ordemComposicao2);
	  modified(estilo_estrutura_Estilo_2);
	  	  
	  flush();
  
      }



  
    /**
     * Identifiers of rule estilosAtivoGlobal
     */
    private String[] identifiers_estilosAtivoGlobal = {
        "e1",
        "e2"
    };

    /**
     * Returns the identifiers declared in rule estilosAtivoGlobal
     *
     * @return the identifiers declared in rule estilosAtivoGlobal
     */
    private String[] getDeclaredIdentifiers_estilosAtivoGlobal() {
         return identifiers_estilosAtivoGlobal;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule estilosAtivoGlobal.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_estilosAtivoGlobal(int index) {
        switch (index) {
            case 0: return "estilo.estrutura.Estilo";
            case 1: return "estilo.estrutura.Estilo";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule estilosAtivoGlobal.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_estilosAtivoGlobal(int index) {
        switch (index) {
            case 0: return estilo.estrutura.Estilo.class;
            case 1: return estilo.estrutura.Estilo.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule estilosAtivoGlobal.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_estilosAtivoGlobal(int index, Object value) {
        switch (index) {
            case 0: this.estilo_estrutura_Estilo_1 = (estilo.estrutura.Estilo) value; break;
            case 1: this.estilo_estrutura_Estilo_2 = (estilo.estrutura.Estilo) value; break;
        }
    }

    /**
     * Returns an object declared in the rule estilosAtivoGlobal.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_estilosAtivoGlobal(int index) {
        switch (index) {
            case 0: return estilo_estrutura_Estilo_1;
            case 1: return estilo_estrutura_Estilo_2;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule estilosAtivoGlobal
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_estilosAtivoGlobal() {
        return new Object[] {
                            estilo_estrutura_Estilo_1,
                            estilo_estrutura_Estilo_2
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule estilosAtivoGlobal
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_estilosAtivoGlobal(Object[] objects) {
        estilo_estrutura_Estilo_1 = (estilo.estrutura.Estilo) objects[0];
        estilo_estrutura_Estilo_2 = (estilo.estrutura.Estilo) objects[1];
    }

    /**
     * Condition 0 of rule estilosAtivoGlobal.<p>
     * The original expression was:<br>
     * <code>e1.getEstiloNome().equalsIgnoreCase("Ativo")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean estilosAtivoGlobal_cond_0() {
        return (estilo_estrutura_Estilo_1.getEstiloNome().equalsIgnoreCase("Ativo"));
    }

    /**
     * Condition 1 of rule estilosAtivoGlobal.<p>
     * The original expression was:<br>
     * <code>e2.getEstiloNome().equalsIgnoreCase("Global")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean estilosAtivoGlobal_cond_1() {
        return (estilo_estrutura_Estilo_2.getEstiloNome().equalsIgnoreCase("Global"));
    }

    /**
     * Checks whether some conditions of rule estilosAtivoGlobal is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean estilosAtivoGlobal_cond(int index) {
        switch (index) {
            case 0: return estilosAtivoGlobal_cond_0();
            case 1: return estilosAtivoGlobal_cond_1();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule estilosAtivoGlobal that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_estilosAtivoGlobal(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!estilosAtivoGlobal_cond_0()) return false;
                return true;
            case 1:
                if (!estilosAtivoGlobal_cond_1()) return false;
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
    private boolean checkCondForDeclaration_estilosAtivoGlobal(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            case 1:
                return true;
            default: return false;
        }
    }

    /**
     * Executes the action part of the rule estilosAtivoGlobal
     */
    private void estilosAtivoGlobal() {
	  System.out.println(" Ativou a regra para os estilos Ativo e Global");
	  
	  OrdemComposicao ordemComposicao1 = new OrdemComposicao();
	  ordemComposicao1.getOrdem().add(new EtapaConteudo("Introdução"));
	  ordemComposicao1.getOrdem().add(new EtapaConteudo("Desenvolvimento"));
	  ordemComposicao1.getOrdem().add(new EtapaConteudo("Atividade"));
	  ordemComposicao1.getOrdem().add(new EtapaConteudo("Resumo"));
	  ordemComposicao1.getOrdem().add(new EtapaConteudo("Avaliação"));
	  
	  OrdemComposicao ordemComposicao2 = new OrdemComposicao();


	  ordemComposicao2.getOrdem().add(new EtapaConteudo("Resumo"));
	  ordemComposicao2.getOrdem().add(new EtapaConteudo("Introdução"));
	  ordemComposicao2.getOrdem().add(new EtapaConteudo("Desenvolvimento"));
	  ordemComposicao2.getOrdem().add(new EtapaConteudo("Atividade"));
	  ordemComposicao2.getOrdem().add(new EtapaConteudo("Avaliação"));
	  
	  ArrayList<RecursoEstilo> recursos = new ArrayList<RecursoEstilo>();
	  recursos.add(new Video());
	  recursos.add(new Diagrama());
	  recursos.add(new Grafico());
	  recursos.add(new Figura());
	  recursos.add(new Slide());
	  recursos.add(new AutoAvaliacao());
	  recursos.add(new Exemplo());
	  recursos.add(new Experimento());
	  recursos.add(new Exercicio());
	  recursos.add(new Simulacao());
	  recursos.add(new Esquema());	  	  	  	  
	  recursos.add(new PaginaWeb());
	  recursos.add(new Mapa());
	  estilo_estrutura_Estilo_1.setRecursos(recursos);
	  estilo_estrutura_Estilo_2.setRecursos(recursos);
	  
	  estilo_estrutura_Estilo_1.setFormaExploracao(new FormaExploracao("Rede"));
	  estilo_estrutura_Estilo_1.setOrdemDetalhamento(new OrdemDetalhamento("Geral para Específico"));
	  estilo_estrutura_Estilo_1.setOrdemComposicao(ordemComposicao1);
	  modified(estilo_estrutura_Estilo_1);
	  
	  estilo_estrutura_Estilo_2.setFormaExploracao(new FormaExploracao("Rede"));
	  estilo_estrutura_Estilo_2.setOrdemDetalhamento(new OrdemDetalhamento("Geral para Específico"));
	  estilo_estrutura_Estilo_2.setOrdemComposicao(ordemComposicao2);
	  modified(estilo_estrutura_Estilo_2);
	  	  
	  flush();
  
      }


  
  
  
    /**
     * Identifiers of rule estilosAtivoSensorial
     */
    private String[] identifiers_estilosAtivoSensorial = {
        "e1",
        "e2"
    };

    /**
     * Returns the identifiers declared in rule estilosAtivoSensorial
     *
     * @return the identifiers declared in rule estilosAtivoSensorial
     */
    private String[] getDeclaredIdentifiers_estilosAtivoSensorial() {
         return identifiers_estilosAtivoSensorial;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule estilosAtivoSensorial.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_estilosAtivoSensorial(int index) {
        switch (index) {
            case 0: return "estilo.estrutura.Estilo";
            case 1: return "estilo.estrutura.Estilo";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule estilosAtivoSensorial.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_estilosAtivoSensorial(int index) {
        switch (index) {
            case 0: return estilo.estrutura.Estilo.class;
            case 1: return estilo.estrutura.Estilo.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule estilosAtivoSensorial.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_estilosAtivoSensorial(int index, Object value) {
        switch (index) {
            case 0: this.estilo_estrutura_Estilo_1 = (estilo.estrutura.Estilo) value; break;
            case 1: this.estilo_estrutura_Estilo_2 = (estilo.estrutura.Estilo) value; break;
        }
    }

    /**
     * Returns an object declared in the rule estilosAtivoSensorial.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_estilosAtivoSensorial(int index) {
        switch (index) {
            case 0: return estilo_estrutura_Estilo_1;
            case 1: return estilo_estrutura_Estilo_2;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule estilosAtivoSensorial
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_estilosAtivoSensorial() {
        return new Object[] {
                            estilo_estrutura_Estilo_1,
                            estilo_estrutura_Estilo_2
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule estilosAtivoSensorial
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_estilosAtivoSensorial(Object[] objects) {
        estilo_estrutura_Estilo_1 = (estilo.estrutura.Estilo) objects[0];
        estilo_estrutura_Estilo_2 = (estilo.estrutura.Estilo) objects[1];
    }

    /**
     * Condition 0 of rule estilosAtivoSensorial.<p>
     * The original expression was:<br>
     * <code>e1.getEstiloNome().equalsIgnoreCase("Ativo")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean estilosAtivoSensorial_cond_0() {
        return (estilo_estrutura_Estilo_1.getEstiloNome().equalsIgnoreCase("Ativo"));
    }

    /**
     * Condition 1 of rule estilosAtivoSensorial.<p>
     * The original expression was:<br>
     * <code>e2.getEstiloNome().equalsIgnoreCase("Sensorial")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean estilosAtivoSensorial_cond_1() {
        return (estilo_estrutura_Estilo_2.getEstiloNome().equalsIgnoreCase("Sensorial"));
    }

    /**
     * Checks whether some conditions of rule estilosAtivoSensorial is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean estilosAtivoSensorial_cond(int index) {
        switch (index) {
            case 0: return estilosAtivoSensorial_cond_0();
            case 1: return estilosAtivoSensorial_cond_1();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule estilosAtivoSensorial that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_estilosAtivoSensorial(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!estilosAtivoSensorial_cond_0()) return false;
                return true;
            case 1:
                if (!estilosAtivoSensorial_cond_1()) return false;
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
    private boolean checkCondForDeclaration_estilosAtivoSensorial(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            case 1:
                return true;
            default: return false;
        }
    }

    /**
     * Executes the action part of the rule estilosAtivoSensorial
     */
    private void estilosAtivoSensorial() {
	  System.out.println(" Ativou a regra para os estilos Ativo e Sensorial");
	  
	  OrdemComposicao ordemComposicao1 = new OrdemComposicao();
	  ordemComposicao1.getOrdem().add(new EtapaConteudo("Introdução"));
	  ordemComposicao1.getOrdem().add(new EtapaConteudo("Desenvolvimento"));
	  ordemComposicao1.getOrdem().add(new EtapaConteudo("Atividade"));
	  ordemComposicao1.getOrdem().add(new EtapaConteudo("Resumo"));
	  ordemComposicao1.getOrdem().add(new EtapaConteudo("Avaliação"));
	  
	  OrdemComposicao ordemComposicao2 = new OrdemComposicao();
      ordemComposicao2.getOrdem().add(new EtapaConteudo("Resumo"));
      ordemComposicao2.getOrdem().add(new EtapaConteudo("Introdução"));
      ordemComposicao2.getOrdem().add(new EtapaConteudo("Desenvolvimento"));
      ordemComposicao2.getOrdem().add(new EtapaConteudo("Atividade"));
      ordemComposicao2.getOrdem().add(new EtapaConteudo("Avaliação"));
	  
	  ArrayList<RecursoEstilo> recursos = new ArrayList<RecursoEstilo>();
	  recursos.add(new Video());
	  recursos.add(new Diagrama());
	  recursos.add(new Grafico());
	  recursos.add(new Figura());
	  recursos.add(new Narracao());
	  recursos.add(new Slide());
	  recursos.add(new AutoAvaliacao());
	  recursos.add(new Exemplo());
	  recursos.add(new Tabela());
	  recursos.add(new Questionario());
	  recursos.add(new Demonstracao());
	  recursos.add(new Exemplo());
	  recursos.add(new Esquema());	  	  	  	  
	  recursos.add(new Mapa());
	  recursos.add(new Experimento());
	  recursos.add(new Exercicio());
	  recursos.add(new Simulacao());
	  recursos.add(new PaginaWeb());
	  estilo_estrutura_Estilo_1.setRecursos(recursos);
	  estilo_estrutura_Estilo_2.setRecursos(recursos);
	  
	  estilo_estrutura_Estilo_1.setFormaExploracao(new FormaExploracao("Rede"));
	  estilo_estrutura_Estilo_1.setOrdemDetalhamento(new OrdemDetalhamento("Geral para Específico"));
	  estilo_estrutura_Estilo_1.setOrdemComposicao(ordemComposicao1);
	  modified(estilo_estrutura_Estilo_1);
	  
	  estilo_estrutura_Estilo_2.setFormaExploracao(new FormaExploracao("Linear"));
	  estilo_estrutura_Estilo_2.setOrdemDetalhamento(new OrdemDetalhamento("Específico para geral"));
	  estilo_estrutura_Estilo_2.setOrdemComposicao(ordemComposicao2);
	  modified(estilo_estrutura_Estilo_2);
	  	  
	  flush();
  
      }




  
    /**
     * Identifiers of rule estilosAtivoIntuitivo
     */
    private String[] identifiers_estilosAtivoIntuitivo = {
        "e1",
        "e2"
    };

    /**
     * Returns the identifiers declared in rule estilosAtivoIntuitivo
     *
     * @return the identifiers declared in rule estilosAtivoIntuitivo
     */
    private String[] getDeclaredIdentifiers_estilosAtivoIntuitivo() {
         return identifiers_estilosAtivoIntuitivo;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule estilosAtivoIntuitivo.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_estilosAtivoIntuitivo(int index) {
        switch (index) {
            case 0: return "estilo.estrutura.Estilo";
            case 1: return "estilo.estrutura.Estilo";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule estilosAtivoIntuitivo.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_estilosAtivoIntuitivo(int index) {
        switch (index) {
            case 0: return estilo.estrutura.Estilo.class;
            case 1: return estilo.estrutura.Estilo.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule estilosAtivoIntuitivo.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_estilosAtivoIntuitivo(int index, Object value) {
        switch (index) {
            case 0: this.estilo_estrutura_Estilo_1 = (estilo.estrutura.Estilo) value; break;
            case 1: this.estilo_estrutura_Estilo_2 = (estilo.estrutura.Estilo) value; break;
        }
    }

    /**
     * Returns an object declared in the rule estilosAtivoIntuitivo.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_estilosAtivoIntuitivo(int index) {
        switch (index) {
            case 0: return estilo_estrutura_Estilo_1;
            case 1: return estilo_estrutura_Estilo_2;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule estilosAtivoIntuitivo
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_estilosAtivoIntuitivo() {
        return new Object[] {
                            estilo_estrutura_Estilo_1,
                            estilo_estrutura_Estilo_2
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule estilosAtivoIntuitivo
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_estilosAtivoIntuitivo(Object[] objects) {
        estilo_estrutura_Estilo_1 = (estilo.estrutura.Estilo) objects[0];
        estilo_estrutura_Estilo_2 = (estilo.estrutura.Estilo) objects[1];
    }

    /**
     * Condition 0 of rule estilosAtivoIntuitivo.<p>
     * The original expression was:<br>
     * <code>e1.getEstiloNome().equalsIgnoreCase("Ativo")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean estilosAtivoIntuitivo_cond_0() {
        return (estilo_estrutura_Estilo_1.getEstiloNome().equalsIgnoreCase("Ativo"));
    }

    /**
     * Condition 1 of rule estilosAtivoIntuitivo.<p>
     * The original expression was:<br>
     * <code>e2.getEstiloNome().equalsIgnoreCase("Intuitivo")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean estilosAtivoIntuitivo_cond_1() {
        return (estilo_estrutura_Estilo_2.getEstiloNome().equalsIgnoreCase("Intuitivo"));
    }

    /**
     * Checks whether some conditions of rule estilosAtivoIntuitivo is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean estilosAtivoIntuitivo_cond(int index) {
        switch (index) {
            case 0: return estilosAtivoIntuitivo_cond_0();
            case 1: return estilosAtivoIntuitivo_cond_1();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule estilosAtivoIntuitivo that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_estilosAtivoIntuitivo(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!estilosAtivoIntuitivo_cond_0()) return false;
                return true;
            case 1:
                if (!estilosAtivoIntuitivo_cond_1()) return false;
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
    private boolean checkCondForDeclaration_estilosAtivoIntuitivo(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            case 1:
                return true;
            default: return false;
        }
    }

    /**
     * Executes the action part of the rule estilosAtivoIntuitivo
     */
    private void estilosAtivoIntuitivo() {
	  System.out.println(" Ativou a regra para os estilos Ativo e Intuitivo");
	  
	  OrdemComposicao ordemComposicao1 = new OrdemComposicao();
	  ordemComposicao1.getOrdem().add(new EtapaConteudo("Introdução"));
	  ordemComposicao1.getOrdem().add(new EtapaConteudo("Desenvolvimento"));
	  ordemComposicao1.getOrdem().add(new EtapaConteudo("Atividade"));
	  ordemComposicao1.getOrdem().add(new EtapaConteudo("Resumo"));
	  ordemComposicao1.getOrdem().add(new EtapaConteudo("Avaliação"));
	  
	  OrdemComposicao ordemComposicao2 = new OrdemComposicao();
	  ordemComposicao2.getOrdem().add(new EtapaConteudo("Introdução"));
	  ordemComposicao2.getOrdem().add(new EtapaConteudo("Desenvolvimento"));
	  ordemComposicao2.getOrdem().add(new EtapaConteudo("Resumo"));
	  ordemComposicao2.getOrdem().add(new EtapaConteudo("Atividade"));
	  ordemComposicao2.getOrdem().add(new EtapaConteudo("Avaliação"));
	  
	  ArrayList<RecursoEstilo> recursos = new ArrayList<RecursoEstilo>();
	  recursos.add(new Video());
	  recursos.add(new Diagrama());
	  recursos.add(new Grafico());
	  recursos.add(new Figura());
	  recursos.add(new Narracao());
	  recursos.add(new Slide());
	  recursos.add(new AutoAvaliacao());
	  recursos.add(new Exemplo());
	  recursos.add(new Tabela());
	  recursos.add(new Questionario());
	  recursos.add(new Demonstracao());
	  recursos.add(new Esquema());	  	  	  	  
	  recursos.add(new Mapa());
	  recursos.add(new Exercicio());
	  recursos.add(new Simulacao());
	  recursos.add(new PaginaWeb());
	  recursos.add(new Palestra());
	  recursos.add(new Animacao());
	  recursos.add(new Foto());
	  estilo_estrutura_Estilo_1.setRecursos(recursos);
	  estilo_estrutura_Estilo_2.setRecursos(recursos);
	  
	  estilo_estrutura_Estilo_1.setFormaExploracao(new FormaExploracao("Rede"));
	  estilo_estrutura_Estilo_1.setOrdemDetalhamento(new OrdemDetalhamento("Geral para Específico"));
	  estilo_estrutura_Estilo_1.setOrdemComposicao(ordemComposicao1);
	  modified(estilo_estrutura_Estilo_1);
	  
	  estilo_estrutura_Estilo_2.setFormaExploracao(new FormaExploracao("Rede"));
	  estilo_estrutura_Estilo_2.setOrdemDetalhamento(new OrdemDetalhamento("Geral para Específico"));
	  estilo_estrutura_Estilo_2.setOrdemComposicao(ordemComposicao2);
	  modified(estilo_estrutura_Estilo_2);
	  	  
	  flush();
  
      }

    
  
  
    /**
     * Identifiers of rule estilosReflexivoVerbal
     */
    private String[] identifiers_estilosReflexivoVerbal = {
        "e1",
        "e2"
    };

    /**
     * Returns the identifiers declared in rule estilosReflexivoVerbal
     *
     * @return the identifiers declared in rule estilosReflexivoVerbal
     */
    private String[] getDeclaredIdentifiers_estilosReflexivoVerbal() {
         return identifiers_estilosReflexivoVerbal;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule estilosReflexivoVerbal.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_estilosReflexivoVerbal(int index) {
        switch (index) {
            case 0: return "estilo.estrutura.Estilo";
            case 1: return "estilo.estrutura.Estilo";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule estilosReflexivoVerbal.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_estilosReflexivoVerbal(int index) {
        switch (index) {
            case 0: return estilo.estrutura.Estilo.class;
            case 1: return estilo.estrutura.Estilo.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule estilosReflexivoVerbal.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_estilosReflexivoVerbal(int index, Object value) {
        switch (index) {
            case 0: this.estilo_estrutura_Estilo_1 = (estilo.estrutura.Estilo) value; break;
            case 1: this.estilo_estrutura_Estilo_2 = (estilo.estrutura.Estilo) value; break;
        }
    }

    /**
     * Returns an object declared in the rule estilosReflexivoVerbal.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_estilosReflexivoVerbal(int index) {
        switch (index) {
            case 0: return estilo_estrutura_Estilo_1;
            case 1: return estilo_estrutura_Estilo_2;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule estilosReflexivoVerbal
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_estilosReflexivoVerbal() {
        return new Object[] {
                            estilo_estrutura_Estilo_1,
                            estilo_estrutura_Estilo_2
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule estilosReflexivoVerbal
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_estilosReflexivoVerbal(Object[] objects) {
        estilo_estrutura_Estilo_1 = (estilo.estrutura.Estilo) objects[0];
        estilo_estrutura_Estilo_2 = (estilo.estrutura.Estilo) objects[1];
    }

    /**
     * Condition 0 of rule estilosReflexivoVerbal.<p>
     * The original expression was:<br>
     * <code>e1.getEstiloNome().equalsIgnoreCase("Reflexivo")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean estilosReflexivoVerbal_cond_0() {
        return (estilo_estrutura_Estilo_1.getEstiloNome().equalsIgnoreCase("Reflexivo"));
    }

    /**
     * Condition 1 of rule estilosReflexivoVerbal.<p>
     * The original expression was:<br>
     * <code>e2.getEstiloNome().equalsIgnoreCase("Verbal")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean estilosReflexivoVerbal_cond_1() {
        return (estilo_estrutura_Estilo_2.getEstiloNome().equalsIgnoreCase("Verbal"));
    }

    /**
     * Checks whether some conditions of rule estilosReflexivoVerbal is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean estilosReflexivoVerbal_cond(int index) {
        switch (index) {
            case 0: return estilosReflexivoVerbal_cond_0();
            case 1: return estilosReflexivoVerbal_cond_1();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule estilosReflexivoVerbal that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_estilosReflexivoVerbal(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!estilosReflexivoVerbal_cond_0()) return false;
                return true;
            case 1:
                if (!estilosReflexivoVerbal_cond_1()) return false;
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
    private boolean checkCondForDeclaration_estilosReflexivoVerbal(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            case 1:
                return true;
            default: return false;
        }
    }

    /**
     * Executes the action part of the rule estilosReflexivoVerbal
     */
    private void estilosReflexivoVerbal() {
	  System.out.println(" Ativou a regra para os estilos Reflexivo e Verbal");
	  
	  OrdemComposicao ordemComposicao1 = new OrdemComposicao();
      ordemComposicao1.getOrdem().add(new EtapaConteudo("Introdução"));
      ordemComposicao1.getOrdem().add(new EtapaConteudo("Desenvolvimento"));
      ordemComposicao1.getOrdem().add(new EtapaConteudo("Resumo"));
      ordemComposicao1.getOrdem().add(new EtapaConteudo("Atividade"));
      ordemComposicao1.getOrdem().add(new EtapaConteudo("Avaliação"));
	  
	  OrdemComposicao ordemComposicao2 = new OrdemComposicao();
	  ordemComposicao2.getOrdem().add(new EtapaConteudo("Resumo"));
	  ordemComposicao2.getOrdem().add(new EtapaConteudo("Introdução"));
	  ordemComposicao2.getOrdem().add(new EtapaConteudo("Desenvolvimento"));
	  ordemComposicao2.getOrdem().add(new EtapaConteudo("Atividade"));
	  ordemComposicao2.getOrdem().add(new EtapaConteudo("Avaliação"));
	  

	  ArrayList<RecursoEstilo> recursos = new ArrayList<RecursoEstilo>();
	  recursos.add(new Diagrama());
	  recursos.add(new Narracao());
	  recursos.add(new Grafico());
	  recursos.add(new Palestra());
	  recursos.add(new Slide());
	  recursos.add(new AutoAvaliacao());
	  recursos.add(new Tabela());
	  recursos.add(new Exercicio());
	  recursos.add(new Questionario());
	  recursos.add(new Simulacao());
	  recursos.add(new Esquema());	  	  	  	  
	  recursos.add(new Animacao());
	  recursos.add(new PaginaWeb());
	  recursos.add(new Demonstracao());
	  recursos.add(new Exemplo());
	  estilo_estrutura_Estilo_1.setRecursos(recursos);
	  estilo_estrutura_Estilo_2.setRecursos(recursos);
	  
	  estilo_estrutura_Estilo_1.setFormaExploracao(new FormaExploracao("Linear"));
	  estilo_estrutura_Estilo_1.setOrdemDetalhamento(new OrdemDetalhamento("Específico para geral"));
	  estilo_estrutura_Estilo_1.setOrdemComposicao(ordemComposicao1);
	  modified(estilo_estrutura_Estilo_1);
	  
	  estilo_estrutura_Estilo_2.setFormaExploracao(new FormaExploracao("Linear"));
	  estilo_estrutura_Estilo_2.setOrdemDetalhamento(new OrdemDetalhamento("Específico para geral"));
	  estilo_estrutura_Estilo_2.setOrdemComposicao(ordemComposicao2);
	  modified(estilo_estrutura_Estilo_2);
	  	  
	  flush();
  
      }

    


  
    /**
     * Identifiers of rule estilosReflexivoVisual
     */
    private String[] identifiers_estilosReflexivoVisual = {
        "e1",
        "e2"
    };

    /**
     * Returns the identifiers declared in rule estilosReflexivoVisual
     *
     * @return the identifiers declared in rule estilosReflexivoVisual
     */
    private String[] getDeclaredIdentifiers_estilosReflexivoVisual() {
         return identifiers_estilosReflexivoVisual;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule estilosReflexivoVisual.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_estilosReflexivoVisual(int index) {
        switch (index) {
            case 0: return "estilo.estrutura.Estilo";
            case 1: return "estilo.estrutura.Estilo";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule estilosReflexivoVisual.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_estilosReflexivoVisual(int index) {
        switch (index) {
            case 0: return estilo.estrutura.Estilo.class;
            case 1: return estilo.estrutura.Estilo.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule estilosReflexivoVisual.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_estilosReflexivoVisual(int index, Object value) {
        switch (index) {
            case 0: this.estilo_estrutura_Estilo_1 = (estilo.estrutura.Estilo) value; break;
            case 1: this.estilo_estrutura_Estilo_2 = (estilo.estrutura.Estilo) value; break;
        }
    }

    /**
     * Returns an object declared in the rule estilosReflexivoVisual.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_estilosReflexivoVisual(int index) {
        switch (index) {
            case 0: return estilo_estrutura_Estilo_1;
            case 1: return estilo_estrutura_Estilo_2;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule estilosReflexivoVisual
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_estilosReflexivoVisual() {
        return new Object[] {
                            estilo_estrutura_Estilo_1,
                            estilo_estrutura_Estilo_2
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule estilosReflexivoVisual
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_estilosReflexivoVisual(Object[] objects) {
        estilo_estrutura_Estilo_1 = (estilo.estrutura.Estilo) objects[0];
        estilo_estrutura_Estilo_2 = (estilo.estrutura.Estilo) objects[1];
    }

    /**
     * Condition 0 of rule estilosReflexivoVisual.<p>
     * The original expression was:<br>
     * <code>e1.getEstiloNome().equalsIgnoreCase("Reflexivo")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean estilosReflexivoVisual_cond_0() {
        return (estilo_estrutura_Estilo_1.getEstiloNome().equalsIgnoreCase("Reflexivo"));
    }

    /**
     * Condition 1 of rule estilosReflexivoVisual.<p>
     * The original expression was:<br>
     * <code>e2.getEstiloNome().equalsIgnoreCase("Visual")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean estilosReflexivoVisual_cond_1() {
        return (estilo_estrutura_Estilo_2.getEstiloNome().equalsIgnoreCase("Visual"));
    }

    /**
     * Checks whether some conditions of rule estilosReflexivoVisual is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean estilosReflexivoVisual_cond(int index) {
        switch (index) {
            case 0: return estilosReflexivoVisual_cond_0();
            case 1: return estilosReflexivoVisual_cond_1();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule estilosReflexivoVisual that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_estilosReflexivoVisual(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!estilosReflexivoVisual_cond_0()) return false;
                return true;
            case 1:
                if (!estilosReflexivoVisual_cond_1()) return false;
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
    private boolean checkCondForDeclaration_estilosReflexivoVisual(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            case 1:
                return true;
            default: return false;
        }
    }

    /**
     * Executes the action part of the rule estilosReflexivoVisual
     */
    private void estilosReflexivoVisual() {
	  System.out.println(" Ativou a regra para os estilos Reflexivo e Visual");
	  
	  OrdemComposicao ordemComposicao1 = new OrdemComposicao();
      ordemComposicao1.getOrdem().add(new EtapaConteudo("Introdução"));
      ordemComposicao1.getOrdem().add(new EtapaConteudo("Desenvolvimento"));
      ordemComposicao1.getOrdem().add(new EtapaConteudo("Resumo"));
      ordemComposicao1.getOrdem().add(new EtapaConteudo("Atividade"));
      ordemComposicao1.getOrdem().add(new EtapaConteudo("Avaliação"));
	  
	  OrdemComposicao ordemComposicao2 = new OrdemComposicao();
	  ordemComposicao2.getOrdem().add(new EtapaConteudo("Resumo"));
	  ordemComposicao2.getOrdem().add(new EtapaConteudo("Introdução"));
	  ordemComposicao2.getOrdem().add(new EtapaConteudo("Desenvolvimento"));
	  ordemComposicao2.getOrdem().add(new EtapaConteudo("Atividade"));
	  ordemComposicao2.getOrdem().add(new EtapaConteudo("Avaliação"));
	  
	  ArrayList<RecursoEstilo> recursos = new ArrayList<RecursoEstilo>();
	  recursos.add(new Video());
	  recursos.add(new Diagrama());
	  recursos.add(new Narracao());
	  recursos.add(new Grafico());
	  recursos.add(new Figura());
	  recursos.add(new Palestra());
	  recursos.add(new Slide());
	  recursos.add(new AutoAvaliacao());
	  recursos.add(new Tabela());
	  recursos.add(new Experimento());	  
	  recursos.add(new Exercicio());
	  recursos.add(new Questionario());
	  recursos.add(new Simulacao());
	  recursos.add(new Esquema());	  	  	  	  
	  recursos.add(new Animacao());
	  recursos.add(new Foto());	  
	  recursos.add(new PaginaWeb());
	  recursos.add(new Mapa());
	  recursos.add(new Demonstracao());
	  recursos.add(new Exemplo());
	  estilo_estrutura_Estilo_1.setRecursos(recursos);
	  estilo_estrutura_Estilo_2.setRecursos(recursos);
	  
	  estilo_estrutura_Estilo_1.setFormaExploracao(new FormaExploracao("Linear"));
	  estilo_estrutura_Estilo_1.setOrdemDetalhamento(new OrdemDetalhamento("Específico para geral"));
	  estilo_estrutura_Estilo_1.setOrdemComposicao(ordemComposicao1);
	  modified(estilo_estrutura_Estilo_1);
	  
	  estilo_estrutura_Estilo_2.setFormaExploracao(new FormaExploracao("Rede"));
	  estilo_estrutura_Estilo_2.setOrdemDetalhamento(new OrdemDetalhamento("Geral para Específico"));
	  estilo_estrutura_Estilo_2.setOrdemComposicao(ordemComposicao2);
	  modified(estilo_estrutura_Estilo_2);
	  	  
	  flush();
  
      }

    


  
    /**
     * Identifiers of rule estilosReflexivoSequencial
     */
    private String[] identifiers_estilosReflexivoSequencial = {
        "e1",
        "e2"
    };

    /**
     * Returns the identifiers declared in rule estilosReflexivoSequencial
     *
     * @return the identifiers declared in rule estilosReflexivoSequencial
     */
    private String[] getDeclaredIdentifiers_estilosReflexivoSequencial() {
         return identifiers_estilosReflexivoSequencial;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule estilosReflexivoSequencial.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_estilosReflexivoSequencial(int index) {
        switch (index) {
            case 0: return "estilo.estrutura.Estilo";
            case 1: return "estilo.estrutura.Estilo";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule estilosReflexivoSequencial.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_estilosReflexivoSequencial(int index) {
        switch (index) {
            case 0: return estilo.estrutura.Estilo.class;
            case 1: return estilo.estrutura.Estilo.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule estilosReflexivoSequencial.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_estilosReflexivoSequencial(int index, Object value) {
        switch (index) {
            case 0: this.estilo_estrutura_Estilo_1 = (estilo.estrutura.Estilo) value; break;
            case 1: this.estilo_estrutura_Estilo_2 = (estilo.estrutura.Estilo) value; break;
        }
    }

    /**
     * Returns an object declared in the rule estilosReflexivoSequencial.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_estilosReflexivoSequencial(int index) {
        switch (index) {
            case 0: return estilo_estrutura_Estilo_1;
            case 1: return estilo_estrutura_Estilo_2;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule estilosReflexivoSequencial
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_estilosReflexivoSequencial() {
        return new Object[] {
                            estilo_estrutura_Estilo_1,
                            estilo_estrutura_Estilo_2
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule estilosReflexivoSequencial
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_estilosReflexivoSequencial(Object[] objects) {
        estilo_estrutura_Estilo_1 = (estilo.estrutura.Estilo) objects[0];
        estilo_estrutura_Estilo_2 = (estilo.estrutura.Estilo) objects[1];
    }

    /**
     * Condition 0 of rule estilosReflexivoSequencial.<p>
     * The original expression was:<br>
     * <code>e1.getEstiloNome().equalsIgnoreCase("Reflexivo")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean estilosReflexivoSequencial_cond_0() {
        return (estilo_estrutura_Estilo_1.getEstiloNome().equalsIgnoreCase("Reflexivo"));
    }

    /**
     * Condition 1 of rule estilosReflexivoSequencial.<p>
     * The original expression was:<br>
     * <code>e2.getEstiloNome().equalsIgnoreCase("Sequencial")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean estilosReflexivoSequencial_cond_1() {
        return (estilo_estrutura_Estilo_2.getEstiloNome().equalsIgnoreCase("Sequencial"));
    }

    /**
     * Checks whether some conditions of rule estilosReflexivoSequencial is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean estilosReflexivoSequencial_cond(int index) {
        switch (index) {
            case 0: return estilosReflexivoSequencial_cond_0();
            case 1: return estilosReflexivoSequencial_cond_1();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule estilosReflexivoSequencial that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_estilosReflexivoSequencial(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!estilosReflexivoSequencial_cond_0()) return false;
                return true;
            case 1:
                if (!estilosReflexivoSequencial_cond_1()) return false;
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
    private boolean checkCondForDeclaration_estilosReflexivoSequencial(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            case 1:
                return true;
            default: return false;
        }
    }

    /**
     * Executes the action part of the rule estilosReflexivoSequencial
     */
    private void estilosReflexivoSequencial() {
	  System.out.println(" Ativou a regra para os estilos Reflexivo e Sequencial");
	  
	  OrdemComposicao ordemComposicao1 = new OrdemComposicao();
      ordemComposicao1.getOrdem().add(new EtapaConteudo("Introdução"));
      ordemComposicao1.getOrdem().add(new EtapaConteudo("Desenvolvimento"));
      ordemComposicao1.getOrdem().add(new EtapaConteudo("Resumo"));
      ordemComposicao1.getOrdem().add(new EtapaConteudo("Atividade"));
      ordemComposicao1.getOrdem().add(new EtapaConteudo("Avaliação"));
	  
	  OrdemComposicao ordemComposicao2 = new OrdemComposicao();
	  ordemComposicao2.getOrdem().add(new EtapaConteudo("Introdução"));
	  ordemComposicao2.getOrdem().add(new EtapaConteudo("Desenvolvimento"));
	  ordemComposicao2.getOrdem().add(new EtapaConteudo("Atividade"));
	  ordemComposicao2.getOrdem().add(new EtapaConteudo("Resumo"));
	  ordemComposicao2.getOrdem().add(new EtapaConteudo("Avaliação"));

	  ArrayList<RecursoEstilo> recursos = new ArrayList<RecursoEstilo>();
	  recursos.add(new Video());
	  recursos.add(new Diagrama());
	  recursos.add(new Narracao());
	  recursos.add(new Grafico());
	  recursos.add(new Figura());
	  recursos.add(new Palestra());
	  recursos.add(new Slide());
	  recursos.add(new AutoAvaliacao());
	  recursos.add(new Tabela());
	  recursos.add(new Experimento());	  
	  recursos.add(new Exercicio());
	  recursos.add(new Questionario());
	  recursos.add(new Simulacao());
	  recursos.add(new Esquema());	  	  	  	  
	  recursos.add(new Animacao());
	  recursos.add(new Foto());	  
	  recursos.add(new PaginaWeb());
	  recursos.add(new Mapa());
	  recursos.add(new Demonstracao());
	  recursos.add(new Exemplo());
	  estilo_estrutura_Estilo_1.setRecursos(recursos);
	  estilo_estrutura_Estilo_2.setRecursos(recursos);
	  
	  estilo_estrutura_Estilo_1.setFormaExploracao(new FormaExploracao("Linear"));
	  estilo_estrutura_Estilo_1.setOrdemDetalhamento(new OrdemDetalhamento("Específico para geral"));
	  estilo_estrutura_Estilo_1.setOrdemComposicao(ordemComposicao1);
	  modified(estilo_estrutura_Estilo_1);
	  
	  estilo_estrutura_Estilo_2.setFormaExploracao(new FormaExploracao("Linear"));
	  estilo_estrutura_Estilo_2.setOrdemDetalhamento(new OrdemDetalhamento("Específico para geral"));
	  estilo_estrutura_Estilo_2.setOrdemComposicao(ordemComposicao2);
	  modified(estilo_estrutura_Estilo_2);
	  	  
	  flush();
  
      }

    


  
    /**
     * Identifiers of rule estilosReflexivoGlobal
     */
    private String[] identifiers_estilosReflexivoGlobal = {
        "e1",
        "e2"
    };

    /**
     * Returns the identifiers declared in rule estilosReflexivoGlobal
     *
     * @return the identifiers declared in rule estilosReflexivoGlobal
     */
    private String[] getDeclaredIdentifiers_estilosReflexivoGlobal() {
         return identifiers_estilosReflexivoGlobal;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule estilosReflexivoGlobal.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_estilosReflexivoGlobal(int index) {
        switch (index) {
            case 0: return "estilo.estrutura.Estilo";
            case 1: return "estilo.estrutura.Estilo";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule estilosReflexivoGlobal.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_estilosReflexivoGlobal(int index) {
        switch (index) {
            case 0: return estilo.estrutura.Estilo.class;
            case 1: return estilo.estrutura.Estilo.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule estilosReflexivoGlobal.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_estilosReflexivoGlobal(int index, Object value) {
        switch (index) {
            case 0: this.estilo_estrutura_Estilo_1 = (estilo.estrutura.Estilo) value; break;
            case 1: this.estilo_estrutura_Estilo_2 = (estilo.estrutura.Estilo) value; break;
        }
    }

    /**
     * Returns an object declared in the rule estilosReflexivoGlobal.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_estilosReflexivoGlobal(int index) {
        switch (index) {
            case 0: return estilo_estrutura_Estilo_1;
            case 1: return estilo_estrutura_Estilo_2;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule estilosReflexivoGlobal
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_estilosReflexivoGlobal() {
        return new Object[] {
                            estilo_estrutura_Estilo_1,
                            estilo_estrutura_Estilo_2
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule estilosReflexivoGlobal
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_estilosReflexivoGlobal(Object[] objects) {
        estilo_estrutura_Estilo_1 = (estilo.estrutura.Estilo) objects[0];
        estilo_estrutura_Estilo_2 = (estilo.estrutura.Estilo) objects[1];
    }

    /**
     * Condition 0 of rule estilosReflexivoGlobal.<p>
     * The original expression was:<br>
     * <code>e1.getEstiloNome().equalsIgnoreCase("Reflexivo")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean estilosReflexivoGlobal_cond_0() {
        return (estilo_estrutura_Estilo_1.getEstiloNome().equalsIgnoreCase("Reflexivo"));
    }

    /**
     * Condition 1 of rule estilosReflexivoGlobal.<p>
     * The original expression was:<br>
     * <code>e2.getEstiloNome().equalsIgnoreCase("Global")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean estilosReflexivoGlobal_cond_1() {
        return (estilo_estrutura_Estilo_2.getEstiloNome().equalsIgnoreCase("Global"));
    }

    /**
     * Checks whether some conditions of rule estilosReflexivoGlobal is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean estilosReflexivoGlobal_cond(int index) {
        switch (index) {
            case 0: return estilosReflexivoGlobal_cond_0();
            case 1: return estilosReflexivoGlobal_cond_1();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule estilosReflexivoGlobal that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_estilosReflexivoGlobal(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!estilosReflexivoGlobal_cond_0()) return false;
                return true;
            case 1:
                if (!estilosReflexivoGlobal_cond_1()) return false;
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
    private boolean checkCondForDeclaration_estilosReflexivoGlobal(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            case 1:
                return true;
            default: return false;
        }
    }

    /**
     * Executes the action part of the rule estilosReflexivoGlobal
     */
    private void estilosReflexivoGlobal() {
	  System.out.println(" Ativou a regra para os estilos Reflexivo e Global");
	  
	  OrdemComposicao ordemComposicao1 = new OrdemComposicao();
      ordemComposicao1.getOrdem().add(new EtapaConteudo("Introdução"));
      ordemComposicao1.getOrdem().add(new EtapaConteudo("Desenvolvimento"));
      ordemComposicao1.getOrdem().add(new EtapaConteudo("Resumo"));
      ordemComposicao1.getOrdem().add(new EtapaConteudo("Atividade"));
      ordemComposicao1.getOrdem().add(new EtapaConteudo("Avaliação"));
	  
	  OrdemComposicao ordemComposicao2 = new OrdemComposicao();
	  ordemComposicao2.getOrdem().add(new EtapaConteudo("Resumo"));
	  ordemComposicao2.getOrdem().add(new EtapaConteudo("Introdução"));
	  ordemComposicao2.getOrdem().add(new EtapaConteudo("Desenvolvimento"));
	  ordemComposicao2.getOrdem().add(new EtapaConteudo("Atividade"));
	  ordemComposicao2.getOrdem().add(new EtapaConteudo("Avaliação"));

	  ArrayList<RecursoEstilo> recursos = new ArrayList<RecursoEstilo>();
	  recursos.add(new Diagrama());
	  recursos.add(new Grafico());
	  recursos.add(new Figura());
	  recursos.add(new Palestra());
	  recursos.add(new Slide());
	  recursos.add(new AutoAvaliacao());
	  recursos.add(new Exercicio());
	  recursos.add(new Simulacao());
	  recursos.add(new Esquema());	  	  	  	  
	  recursos.add(new Animacao());
	  recursos.add(new PaginaWeb());
	  recursos.add(new Demonstracao());
	  recursos.add(new Exemplo());
	  recursos.add(new Experimento());	  
	  recursos.add(new Mapa());
	  estilo_estrutura_Estilo_1.setRecursos(recursos);
	  estilo_estrutura_Estilo_2.setRecursos(recursos);
	  
	  estilo_estrutura_Estilo_1.setFormaExploracao(new FormaExploracao("Linear"));
	  estilo_estrutura_Estilo_1.setOrdemDetalhamento(new OrdemDetalhamento("Específico para geral"));
	  estilo_estrutura_Estilo_1.setOrdemComposicao(ordemComposicao1);
	  modified(estilo_estrutura_Estilo_1);
	  
	  estilo_estrutura_Estilo_2.setFormaExploracao(new FormaExploracao("Rede"));
	  estilo_estrutura_Estilo_2.setOrdemDetalhamento(new OrdemDetalhamento("Geral para Específico"));
	  estilo_estrutura_Estilo_2.setOrdemComposicao(ordemComposicao2);
	  modified(estilo_estrutura_Estilo_2);
	  	  
	  flush();
  
      }


  
  
    /**
     * Identifiers of rule estilosReflexivoSensorial
     */
    private String[] identifiers_estilosReflexivoSensorial = {
        "e1",
        "e2"
    };

    /**
     * Returns the identifiers declared in rule estilosReflexivoSensorial
     *
     * @return the identifiers declared in rule estilosReflexivoSensorial
     */
    private String[] getDeclaredIdentifiers_estilosReflexivoSensorial() {
         return identifiers_estilosReflexivoSensorial;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule estilosReflexivoSensorial.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_estilosReflexivoSensorial(int index) {
        switch (index) {
            case 0: return "estilo.estrutura.Estilo";
            case 1: return "estilo.estrutura.Estilo";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule estilosReflexivoSensorial.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_estilosReflexivoSensorial(int index) {
        switch (index) {
            case 0: return estilo.estrutura.Estilo.class;
            case 1: return estilo.estrutura.Estilo.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule estilosReflexivoSensorial.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_estilosReflexivoSensorial(int index, Object value) {
        switch (index) {
            case 0: this.estilo_estrutura_Estilo_1 = (estilo.estrutura.Estilo) value; break;
            case 1: this.estilo_estrutura_Estilo_2 = (estilo.estrutura.Estilo) value; break;
        }
    }

    /**
     * Returns an object declared in the rule estilosReflexivoSensorial.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_estilosReflexivoSensorial(int index) {
        switch (index) {
            case 0: return estilo_estrutura_Estilo_1;
            case 1: return estilo_estrutura_Estilo_2;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule estilosReflexivoSensorial
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_estilosReflexivoSensorial() {
        return new Object[] {
                            estilo_estrutura_Estilo_1,
                            estilo_estrutura_Estilo_2
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule estilosReflexivoSensorial
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_estilosReflexivoSensorial(Object[] objects) {
        estilo_estrutura_Estilo_1 = (estilo.estrutura.Estilo) objects[0];
        estilo_estrutura_Estilo_2 = (estilo.estrutura.Estilo) objects[1];
    }

    /**
     * Condition 0 of rule estilosReflexivoSensorial.<p>
     * The original expression was:<br>
     * <code>e1.getEstiloNome().equalsIgnoreCase("Reflexivo")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean estilosReflexivoSensorial_cond_0() {
        return (estilo_estrutura_Estilo_1.getEstiloNome().equalsIgnoreCase("Reflexivo"));
    }

    /**
     * Condition 1 of rule estilosReflexivoSensorial.<p>
     * The original expression was:<br>
     * <code>e2.getEstiloNome().equalsIgnoreCase("Sensorial")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean estilosReflexivoSensorial_cond_1() {
        return (estilo_estrutura_Estilo_2.getEstiloNome().equalsIgnoreCase("Sensorial"));
    }

    /**
     * Checks whether some conditions of rule estilosReflexivoSensorial is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean estilosReflexivoSensorial_cond(int index) {
        switch (index) {
            case 0: return estilosReflexivoSensorial_cond_0();
            case 1: return estilosReflexivoSensorial_cond_1();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule estilosReflexivoSensorial that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_estilosReflexivoSensorial(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!estilosReflexivoSensorial_cond_0()) return false;
                return true;
            case 1:
                if (!estilosReflexivoSensorial_cond_1()) return false;
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
    private boolean checkCondForDeclaration_estilosReflexivoSensorial(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            case 1:
                return true;
            default: return false;
        }
    }

    /**
     * Executes the action part of the rule estilosReflexivoSensorial
     */
    private void estilosReflexivoSensorial() {
	  System.out.println(" Ativou a regra para os estilos Reflexivo e Sensorial");
	  
	  OrdemComposicao ordemComposicao1 = new OrdemComposicao();
      ordemComposicao1.getOrdem().add(new EtapaConteudo("Introdução"));
      ordemComposicao1.getOrdem().add(new EtapaConteudo("Desenvolvimento"));
      ordemComposicao1.getOrdem().add(new EtapaConteudo("Resumo"));
      ordemComposicao1.getOrdem().add(new EtapaConteudo("Atividade"));
      ordemComposicao1.getOrdem().add(new EtapaConteudo("Avaliação"));
	  
	  OrdemComposicao ordemComposicao2 = new OrdemComposicao();
	  ordemComposicao2.getOrdem().add(new EtapaConteudo("Resumo"));
      ordemComposicao2.getOrdem().add(new EtapaConteudo("Introdução"));
      ordemComposicao2.getOrdem().add(new EtapaConteudo("Desenvolvimento"));
      ordemComposicao2.getOrdem().add(new EtapaConteudo("Atividade"));
      ordemComposicao2.getOrdem().add(new EtapaConteudo("Avaliação"));

	  ArrayList<RecursoEstilo> recursos = new ArrayList<RecursoEstilo>();
	  recursos.add(new Video());
	  recursos.add(new Diagrama());
	  recursos.add(new Grafico());
	  recursos.add(new Palestra());
	  recursos.add(new Slide());
	  recursos.add(new AutoAvaliacao());
	  recursos.add(new Tabela());
	  recursos.add(new Exercicio());
	  recursos.add(new Simulacao());
	  recursos.add(new Esquema());	  	  	  	  
	  recursos.add(new Animacao());
	  recursos.add(new PaginaWeb());
	  recursos.add(new Demonstracao());
	  recursos.add(new Exemplo());
	  recursos.add(new Narracao());
	  recursos.add(new Experimento());	  
	  recursos.add(new Questionario());	  
	  recursos.add(new Mapa());
	  estilo_estrutura_Estilo_1.setRecursos(recursos);
	  estilo_estrutura_Estilo_2.setRecursos(recursos);
	  
	  estilo_estrutura_Estilo_1.setFormaExploracao(new FormaExploracao("Linear"));
	  estilo_estrutura_Estilo_1.setOrdemDetalhamento(new OrdemDetalhamento("Específico para geral"));
	  estilo_estrutura_Estilo_1.setOrdemComposicao(ordemComposicao1);
	  modified(estilo_estrutura_Estilo_1);
	  
	  estilo_estrutura_Estilo_2.setFormaExploracao(new FormaExploracao("Linear"));
	  estilo_estrutura_Estilo_2.setOrdemDetalhamento(new OrdemDetalhamento("Específico para geral"));
	  estilo_estrutura_Estilo_2.setOrdemComposicao(ordemComposicao2);
	  modified(estilo_estrutura_Estilo_2);
	  	  
	  flush();
  
      }


    
  
  
    /**
     * Identifiers of rule estilosReflexivoIntuitivo
     */
    private String[] identifiers_estilosReflexivoIntuitivo = {
        "e1",
        "e2"
    };

    /**
     * Returns the identifiers declared in rule estilosReflexivoIntuitivo
     *
     * @return the identifiers declared in rule estilosReflexivoIntuitivo
     */
    private String[] getDeclaredIdentifiers_estilosReflexivoIntuitivo() {
         return identifiers_estilosReflexivoIntuitivo;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule estilosReflexivoIntuitivo.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_estilosReflexivoIntuitivo(int index) {
        switch (index) {
            case 0: return "estilo.estrutura.Estilo";
            case 1: return "estilo.estrutura.Estilo";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule estilosReflexivoIntuitivo.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_estilosReflexivoIntuitivo(int index) {
        switch (index) {
            case 0: return estilo.estrutura.Estilo.class;
            case 1: return estilo.estrutura.Estilo.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule estilosReflexivoIntuitivo.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_estilosReflexivoIntuitivo(int index, Object value) {
        switch (index) {
            case 0: this.estilo_estrutura_Estilo_1 = (estilo.estrutura.Estilo) value; break;
            case 1: this.estilo_estrutura_Estilo_2 = (estilo.estrutura.Estilo) value; break;
        }
    }

    /**
     * Returns an object declared in the rule estilosReflexivoIntuitivo.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_estilosReflexivoIntuitivo(int index) {
        switch (index) {
            case 0: return estilo_estrutura_Estilo_1;
            case 1: return estilo_estrutura_Estilo_2;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule estilosReflexivoIntuitivo
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_estilosReflexivoIntuitivo() {
        return new Object[] {
                            estilo_estrutura_Estilo_1,
                            estilo_estrutura_Estilo_2
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule estilosReflexivoIntuitivo
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_estilosReflexivoIntuitivo(Object[] objects) {
        estilo_estrutura_Estilo_1 = (estilo.estrutura.Estilo) objects[0];
        estilo_estrutura_Estilo_2 = (estilo.estrutura.Estilo) objects[1];
    }

    /**
     * Condition 0 of rule estilosReflexivoIntuitivo.<p>
     * The original expression was:<br>
     * <code>e1.getEstiloNome().equalsIgnoreCase("Reflexivo")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean estilosReflexivoIntuitivo_cond_0() {
        return (estilo_estrutura_Estilo_1.getEstiloNome().equalsIgnoreCase("Reflexivo"));
    }

    /**
     * Condition 1 of rule estilosReflexivoIntuitivo.<p>
     * The original expression was:<br>
     * <code>e2.getEstiloNome().equalsIgnoreCase("Intuitivo")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean estilosReflexivoIntuitivo_cond_1() {
        return (estilo_estrutura_Estilo_2.getEstiloNome().equalsIgnoreCase("Intuitivo"));
    }

    /**
     * Checks whether some conditions of rule estilosReflexivoIntuitivo is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean estilosReflexivoIntuitivo_cond(int index) {
        switch (index) {
            case 0: return estilosReflexivoIntuitivo_cond_0();
            case 1: return estilosReflexivoIntuitivo_cond_1();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule estilosReflexivoIntuitivo that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_estilosReflexivoIntuitivo(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!estilosReflexivoIntuitivo_cond_0()) return false;
                return true;
            case 1:
                if (!estilosReflexivoIntuitivo_cond_1()) return false;
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
    private boolean checkCondForDeclaration_estilosReflexivoIntuitivo(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            case 1:
                return true;
            default: return false;
        }
    }

    /**
     * Executes the action part of the rule estilosReflexivoIntuitivo
     */
    private void estilosReflexivoIntuitivo() {
	  System.out.println(" Ativou a regra para os estilos Reflexivo e Intuitivo");
	  
	  OrdemComposicao ordemComposicao1 = new OrdemComposicao();
      ordemComposicao1.getOrdem().add(new EtapaConteudo("Introdução"));
      ordemComposicao1.getOrdem().add(new EtapaConteudo("Desenvolvimento"));
      ordemComposicao1.getOrdem().add(new EtapaConteudo("Resumo"));
      ordemComposicao1.getOrdem().add(new EtapaConteudo("Atividade"));
      ordemComposicao1.getOrdem().add(new EtapaConteudo("Avaliação"));
	  
	  OrdemComposicao ordemComposicao2 = new OrdemComposicao();
	  ordemComposicao2.getOrdem().add(new EtapaConteudo("Introdução"));
	  ordemComposicao2.getOrdem().add(new EtapaConteudo("Desenvolvimento"));
	  ordemComposicao2.getOrdem().add(new EtapaConteudo("Resumo"));
	  ordemComposicao2.getOrdem().add(new EtapaConteudo("Atividade"));
	  ordemComposicao2.getOrdem().add(new EtapaConteudo("Avaliação"));

	  ArrayList<RecursoEstilo> recursos = new ArrayList<RecursoEstilo>();
	  recursos.add(new Diagrama());
	  recursos.add(new Grafico());
	  recursos.add(new Palestra());
	  recursos.add(new Slide());
	  recursos.add(new AutoAvaliacao());
	  recursos.add(new Tabela());
	  recursos.add(new Exercicio());
	  recursos.add(new Simulacao());
	  recursos.add(new Esquema());	  	  	  	  
	  recursos.add(new Animacao());
	  recursos.add(new PaginaWeb());
	  recursos.add(new Demonstracao());
	  recursos.add(new Exemplo());
	  recursos.add(new Figura());	  
	  recursos.add(new Narracao());
	  recursos.add(new Questionario());	  
	  recursos.add(new Foto());	  
	  
	  estilo_estrutura_Estilo_1.setRecursos(recursos);
	  estilo_estrutura_Estilo_2.setRecursos(recursos);
	  
	  estilo_estrutura_Estilo_1.setFormaExploracao(new FormaExploracao("Linear"));
	  estilo_estrutura_Estilo_1.setOrdemDetalhamento(new OrdemDetalhamento("Específico para geral"));
	  estilo_estrutura_Estilo_1.setOrdemComposicao(ordemComposicao1);
	  modified(estilo_estrutura_Estilo_1);
	  
	  estilo_estrutura_Estilo_2.setFormaExploracao(new FormaExploracao("Rede"));
	  estilo_estrutura_Estilo_2.setOrdemDetalhamento(new OrdemDetalhamento("Geral para Específico"));
	  estilo_estrutura_Estilo_2.setOrdemComposicao(ordemComposicao2);
	  modified(estilo_estrutura_Estilo_2);
	  	  
	  flush();
  
      }



  
    /**
     * Identifiers of rule estilosSensorialVerbal
     */
    private String[] identifiers_estilosSensorialVerbal = {
        "e1",
        "e2"
    };

    /**
     * Returns the identifiers declared in rule estilosSensorialVerbal
     *
     * @return the identifiers declared in rule estilosSensorialVerbal
     */
    private String[] getDeclaredIdentifiers_estilosSensorialVerbal() {
         return identifiers_estilosSensorialVerbal;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule estilosSensorialVerbal.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_estilosSensorialVerbal(int index) {
        switch (index) {
            case 0: return "estilo.estrutura.Estilo";
            case 1: return "estilo.estrutura.Estilo";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule estilosSensorialVerbal.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_estilosSensorialVerbal(int index) {
        switch (index) {
            case 0: return estilo.estrutura.Estilo.class;
            case 1: return estilo.estrutura.Estilo.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule estilosSensorialVerbal.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_estilosSensorialVerbal(int index, Object value) {
        switch (index) {
            case 0: this.estilo_estrutura_Estilo_1 = (estilo.estrutura.Estilo) value; break;
            case 1: this.estilo_estrutura_Estilo_2 = (estilo.estrutura.Estilo) value; break;
        }
    }

    /**
     * Returns an object declared in the rule estilosSensorialVerbal.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_estilosSensorialVerbal(int index) {
        switch (index) {
            case 0: return estilo_estrutura_Estilo_1;
            case 1: return estilo_estrutura_Estilo_2;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule estilosSensorialVerbal
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_estilosSensorialVerbal() {
        return new Object[] {
                            estilo_estrutura_Estilo_1,
                            estilo_estrutura_Estilo_2
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule estilosSensorialVerbal
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_estilosSensorialVerbal(Object[] objects) {
        estilo_estrutura_Estilo_1 = (estilo.estrutura.Estilo) objects[0];
        estilo_estrutura_Estilo_2 = (estilo.estrutura.Estilo) objects[1];
    }

    /**
     * Condition 0 of rule estilosSensorialVerbal.<p>
     * The original expression was:<br>
     * <code>e1.getEstiloNome().equalsIgnoreCase("Sensorial")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean estilosSensorialVerbal_cond_0() {
        return (estilo_estrutura_Estilo_1.getEstiloNome().equalsIgnoreCase("Sensorial"));
    }

    /**
     * Condition 1 of rule estilosSensorialVerbal.<p>
     * The original expression was:<br>
     * <code>e2.getEstiloNome().equalsIgnoreCase("Verbal")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean estilosSensorialVerbal_cond_1() {
        return (estilo_estrutura_Estilo_2.getEstiloNome().equalsIgnoreCase("Verbal"));
    }

    /**
     * Checks whether some conditions of rule estilosSensorialVerbal is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean estilosSensorialVerbal_cond(int index) {
        switch (index) {
            case 0: return estilosSensorialVerbal_cond_0();
            case 1: return estilosSensorialVerbal_cond_1();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule estilosSensorialVerbal that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_estilosSensorialVerbal(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!estilosSensorialVerbal_cond_0()) return false;
                return true;
            case 1:
                if (!estilosSensorialVerbal_cond_1()) return false;
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
    private boolean checkCondForDeclaration_estilosSensorialVerbal(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            case 1:
                return true;
            default: return false;
        }
    }

    /**
     * Executes the action part of the rule estilosSensorialVerbal
     */
    private void estilosSensorialVerbal() {
	  System.out.println(" Ativou a regra para os estilos Sensorial e Verbal");
	  
	  OrdemComposicao ordemComposicao1 = new OrdemComposicao();
      ordemComposicao1.getOrdem().add(new EtapaConteudo("Resumo"));
      ordemComposicao1.getOrdem().add(new EtapaConteudo("Introdução"));
      ordemComposicao1.getOrdem().add(new EtapaConteudo("Desenvolvimento"));
      ordemComposicao1.getOrdem().add(new EtapaConteudo("Atividade"));
      ordemComposicao1.getOrdem().add(new EtapaConteudo("Avaliação"));
	  
	  OrdemComposicao ordemComposicao2 = new OrdemComposicao();
	  ordemComposicao2.getOrdem().add(new EtapaConteudo("Resumo"));
	  ordemComposicao2.getOrdem().add(new EtapaConteudo("Introdução"));
	  ordemComposicao2.getOrdem().add(new EtapaConteudo("Desenvolvimento"));
	  ordemComposicao2.getOrdem().add(new EtapaConteudo("Atividade"));
	  ordemComposicao2.getOrdem().add(new EtapaConteudo("Avaliação"));
	  
	  ArrayList<RecursoEstilo> recursos = new ArrayList<RecursoEstilo>();
	  recursos.add(new Diagrama());
	  recursos.add(new Video());
	  recursos.add(new Grafico());
	  recursos.add(new Narracao());
	  recursos.add(new Slide());
	  recursos.add(new AutoAvaliacao());
	  recursos.add(new Tabela());
	  recursos.add(new Palestra());
	  recursos.add(new Experimento());
	  recursos.add(new Exercicio());
	  recursos.add(new Questionario());	  
	  recursos.add(new PaginaWeb());
	  recursos.add(new Mapa());
	  recursos.add(new Demonstracao());
	  recursos.add(new Exemplo());
	  	  
	  estilo_estrutura_Estilo_1.setRecursos(recursos);
	  estilo_estrutura_Estilo_2.setRecursos(recursos);
	  

	  estilo_estrutura_Estilo_1.setFormaExploracao(new FormaExploracao("Linear"));
	  estilo_estrutura_Estilo_1.setOrdemDetalhamento(new OrdemDetalhamento("Específico para geral"));
	  estilo_estrutura_Estilo_1.setOrdemComposicao(ordemComposicao1);
	  modified(estilo_estrutura_Estilo_1);
	  
	  estilo_estrutura_Estilo_2.setFormaExploracao(new FormaExploracao("Linear"));
	  estilo_estrutura_Estilo_2.setOrdemDetalhamento(new OrdemDetalhamento("Específico para geral"));
	  estilo_estrutura_Estilo_2.setOrdemComposicao(ordemComposicao2);
	  modified(estilo_estrutura_Estilo_2);
	  	  
	  flush();
  
      }




  
    /**
     * Identifiers of rule estilosSensorialVisual
     */
    private String[] identifiers_estilosSensorialVisual = {
        "e1",
        "e2"
    };

    /**
     * Returns the identifiers declared in rule estilosSensorialVisual
     *
     * @return the identifiers declared in rule estilosSensorialVisual
     */
    private String[] getDeclaredIdentifiers_estilosSensorialVisual() {
         return identifiers_estilosSensorialVisual;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule estilosSensorialVisual.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_estilosSensorialVisual(int index) {
        switch (index) {
            case 0: return "estilo.estrutura.Estilo";
            case 1: return "estilo.estrutura.Estilo";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule estilosSensorialVisual.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_estilosSensorialVisual(int index) {
        switch (index) {
            case 0: return estilo.estrutura.Estilo.class;
            case 1: return estilo.estrutura.Estilo.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule estilosSensorialVisual.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_estilosSensorialVisual(int index, Object value) {
        switch (index) {
            case 0: this.estilo_estrutura_Estilo_1 = (estilo.estrutura.Estilo) value; break;
            case 1: this.estilo_estrutura_Estilo_2 = (estilo.estrutura.Estilo) value; break;
        }
    }

    /**
     * Returns an object declared in the rule estilosSensorialVisual.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_estilosSensorialVisual(int index) {
        switch (index) {
            case 0: return estilo_estrutura_Estilo_1;
            case 1: return estilo_estrutura_Estilo_2;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule estilosSensorialVisual
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_estilosSensorialVisual() {
        return new Object[] {
                            estilo_estrutura_Estilo_1,
                            estilo_estrutura_Estilo_2
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule estilosSensorialVisual
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_estilosSensorialVisual(Object[] objects) {
        estilo_estrutura_Estilo_1 = (estilo.estrutura.Estilo) objects[0];
        estilo_estrutura_Estilo_2 = (estilo.estrutura.Estilo) objects[1];
    }

    /**
     * Condition 0 of rule estilosSensorialVisual.<p>
     * The original expression was:<br>
     * <code>e1.getEstiloNome().equalsIgnoreCase("Sensorial")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean estilosSensorialVisual_cond_0() {
        return (estilo_estrutura_Estilo_1.getEstiloNome().equalsIgnoreCase("Sensorial"));
    }

    /**
     * Condition 1 of rule estilosSensorialVisual.<p>
     * The original expression was:<br>
     * <code>e2.getEstiloNome().equalsIgnoreCase("Visual")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean estilosSensorialVisual_cond_1() {
        return (estilo_estrutura_Estilo_2.getEstiloNome().equalsIgnoreCase("Visual"));
    }

    /**
     * Checks whether some conditions of rule estilosSensorialVisual is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean estilosSensorialVisual_cond(int index) {
        switch (index) {
            case 0: return estilosSensorialVisual_cond_0();
            case 1: return estilosSensorialVisual_cond_1();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule estilosSensorialVisual that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_estilosSensorialVisual(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!estilosSensorialVisual_cond_0()) return false;
                return true;
            case 1:
                if (!estilosSensorialVisual_cond_1()) return false;
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
    private boolean checkCondForDeclaration_estilosSensorialVisual(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            case 1:
                return true;
            default: return false;
        }
    }

    /**
     * Executes the action part of the rule estilosSensorialVisual
     */
    private void estilosSensorialVisual() {
	  System.out.println(" Ativou a regra para os estilos Sensorial e Visual");
	  
	  OrdemComposicao ordemComposicao1 = new OrdemComposicao();
      ordemComposicao1.getOrdem().add(new EtapaConteudo("Resumo"));
      ordemComposicao1.getOrdem().add(new EtapaConteudo("Introdução"));
      ordemComposicao1.getOrdem().add(new EtapaConteudo("Desenvolvimento"));
      ordemComposicao1.getOrdem().add(new EtapaConteudo("Atividade"));
      ordemComposicao1.getOrdem().add(new EtapaConteudo("Avaliação"));
	  
	  OrdemComposicao ordemComposicao2 = new OrdemComposicao();
	  ordemComposicao2.getOrdem().add(new EtapaConteudo("Resumo"));
	  ordemComposicao2.getOrdem().add(new EtapaConteudo("Introdução"));
	  ordemComposicao2.getOrdem().add(new EtapaConteudo("Desenvolvimento"));
	  ordemComposicao2.getOrdem().add(new EtapaConteudo("Atividade"));
	  ordemComposicao2.getOrdem().add(new EtapaConteudo("Avaliação"));
	  
	  ArrayList<RecursoEstilo> recursos = new ArrayList<RecursoEstilo>();
	  recursos.add(new Video());
	  recursos.add(new Diagrama());
	  recursos.add(new Grafico());
	  recursos.add(new Narracao());
	  recursos.add(new Slide());
	  recursos.add(new AutoAvaliacao());
	  recursos.add(new Tabela());
	  recursos.add(new Figura());
	  recursos.add(new Experimento());
	  recursos.add(new Exercicio());
	  recursos.add(new Questionario());	  
	  recursos.add(new PaginaWeb());
	  recursos.add(new Mapa());
	  recursos.add(new Demonstracao());
	  recursos.add(new Exemplo());
	  recursos.add(new Simulacao());
	  recursos.add(new Animacao());
	  recursos.add(new Foto());
	  	  
	  estilo_estrutura_Estilo_1.setRecursos(recursos);
	  estilo_estrutura_Estilo_2.setRecursos(recursos);
	  

	  estilo_estrutura_Estilo_1.setFormaExploracao(new FormaExploracao("Linear"));
	  estilo_estrutura_Estilo_1.setOrdemDetalhamento(new OrdemDetalhamento("Específico para geral"));
	  estilo_estrutura_Estilo_1.setOrdemComposicao(ordemComposicao1);
	  modified(estilo_estrutura_Estilo_1);

	  estilo_estrutura_Estilo_2.setFormaExploracao(new FormaExploracao("Rede"));
	  estilo_estrutura_Estilo_2.setOrdemDetalhamento(new OrdemDetalhamento("Geral para Específico"));	  
	  estilo_estrutura_Estilo_2.setOrdemComposicao(ordemComposicao2);
	  modified(estilo_estrutura_Estilo_2);
	  	  
	  flush();
  
      }




  
    /**
     * Identifiers of rule estilosSensorialSequencial
     */
    private String[] identifiers_estilosSensorialSequencial = {
        "e1",
        "e2"
    };

    /**
     * Returns the identifiers declared in rule estilosSensorialSequencial
     *
     * @return the identifiers declared in rule estilosSensorialSequencial
     */
    private String[] getDeclaredIdentifiers_estilosSensorialSequencial() {
         return identifiers_estilosSensorialSequencial;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule estilosSensorialSequencial.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_estilosSensorialSequencial(int index) {
        switch (index) {
            case 0: return "estilo.estrutura.Estilo";
            case 1: return "estilo.estrutura.Estilo";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule estilosSensorialSequencial.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_estilosSensorialSequencial(int index) {
        switch (index) {
            case 0: return estilo.estrutura.Estilo.class;
            case 1: return estilo.estrutura.Estilo.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule estilosSensorialSequencial.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_estilosSensorialSequencial(int index, Object value) {
        switch (index) {
            case 0: this.estilo_estrutura_Estilo_1 = (estilo.estrutura.Estilo) value; break;
            case 1: this.estilo_estrutura_Estilo_2 = (estilo.estrutura.Estilo) value; break;
        }
    }

    /**
     * Returns an object declared in the rule estilosSensorialSequencial.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_estilosSensorialSequencial(int index) {
        switch (index) {
            case 0: return estilo_estrutura_Estilo_1;
            case 1: return estilo_estrutura_Estilo_2;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule estilosSensorialSequencial
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_estilosSensorialSequencial() {
        return new Object[] {
                            estilo_estrutura_Estilo_1,
                            estilo_estrutura_Estilo_2
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule estilosSensorialSequencial
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_estilosSensorialSequencial(Object[] objects) {
        estilo_estrutura_Estilo_1 = (estilo.estrutura.Estilo) objects[0];
        estilo_estrutura_Estilo_2 = (estilo.estrutura.Estilo) objects[1];
    }

    /**
     * Condition 0 of rule estilosSensorialSequencial.<p>
     * The original expression was:<br>
     * <code>e1.getEstiloNome().equalsIgnoreCase("Sensorial")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean estilosSensorialSequencial_cond_0() {
        return (estilo_estrutura_Estilo_1.getEstiloNome().equalsIgnoreCase("Sensorial"));
    }

    /**
     * Condition 1 of rule estilosSensorialSequencial.<p>
     * The original expression was:<br>
     * <code>e2.getEstiloNome().equalsIgnoreCase("Sequencial")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean estilosSensorialSequencial_cond_1() {
        return (estilo_estrutura_Estilo_2.getEstiloNome().equalsIgnoreCase("Sequencial"));
    }

    /**
     * Checks whether some conditions of rule estilosSensorialSequencial is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean estilosSensorialSequencial_cond(int index) {
        switch (index) {
            case 0: return estilosSensorialSequencial_cond_0();
            case 1: return estilosSensorialSequencial_cond_1();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule estilosSensorialSequencial that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_estilosSensorialSequencial(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!estilosSensorialSequencial_cond_0()) return false;
                return true;
            case 1:
                if (!estilosSensorialSequencial_cond_1()) return false;
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
    private boolean checkCondForDeclaration_estilosSensorialSequencial(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            case 1:
                return true;
            default: return false;
        }
    }

    /**
     * Executes the action part of the rule estilosSensorialSequencial
     */
    private void estilosSensorialSequencial() {
	  System.out.println(" Ativou a regra para os estilos Sensorial e Sequencial");
	  
	  OrdemComposicao ordemComposicao1 = new OrdemComposicao();
      ordemComposicao1.getOrdem().add(new EtapaConteudo("Resumo"));
      ordemComposicao1.getOrdem().add(new EtapaConteudo("Introdução"));
      ordemComposicao1.getOrdem().add(new EtapaConteudo("Desenvolvimento"));
      ordemComposicao1.getOrdem().add(new EtapaConteudo("Atividade"));
      ordemComposicao1.getOrdem().add(new EtapaConteudo("Avaliação"));
	  
	  OrdemComposicao ordemComposicao2 = new OrdemComposicao();
	  ordemComposicao2.getOrdem().add(new EtapaConteudo("Introdução"));
	  ordemComposicao2.getOrdem().add(new EtapaConteudo("Desenvolvimento"));
	  ordemComposicao2.getOrdem().add(new EtapaConteudo("Atividade"));
	  ordemComposicao2.getOrdem().add(new EtapaConteudo("Resumo"));
	  ordemComposicao2.getOrdem().add(new EtapaConteudo("Avaliação"));
	  
	  
	  ArrayList<RecursoEstilo> recursos = new ArrayList<RecursoEstilo>();
	  recursos.add(new Video());
	  recursos.add(new Diagrama());
	  recursos.add(new Grafico());
	  recursos.add(new Narracao());
	  recursos.add(new Slide());
	  recursos.add(new AutoAvaliacao());
	  recursos.add(new Tabela());
	  recursos.add(new Figura());
	  recursos.add(new Experimento());
	  recursos.add(new Exercicio());
	  recursos.add(new Questionario());	  
	  recursos.add(new PaginaWeb());
	  recursos.add(new Mapa());
	  recursos.add(new Demonstracao());
	  recursos.add(new Exemplo());
	  recursos.add(new Simulacao());
	  recursos.add(new Animacao());
	  recursos.add(new Foto());
	  	  
	  estilo_estrutura_Estilo_1.setRecursos(recursos);
	  estilo_estrutura_Estilo_2.setRecursos(recursos);

	  estilo_estrutura_Estilo_1.setFormaExploracao(new FormaExploracao("Linear"));
	  estilo_estrutura_Estilo_1.setOrdemDetalhamento(new OrdemDetalhamento("Específico para geral"));
	  estilo_estrutura_Estilo_1.setOrdemComposicao(ordemComposicao1);
	  modified(estilo_estrutura_Estilo_1);

	  estilo_estrutura_Estilo_2.setFormaExploracao(new FormaExploracao("Linear"));
	  estilo_estrutura_Estilo_2.setOrdemDetalhamento(new OrdemDetalhamento("Específico para geral"));	  	  
	  estilo_estrutura_Estilo_2.setOrdemComposicao(ordemComposicao2);
	  modified(estilo_estrutura_Estilo_2);
	  	  
	  flush();
  
      }




  
    /**
     * Identifiers of rule estilosSensorialGlobal
     */
    private String[] identifiers_estilosSensorialGlobal = {
        "e1",
        "e2"
    };

    /**
     * Returns the identifiers declared in rule estilosSensorialGlobal
     *
     * @return the identifiers declared in rule estilosSensorialGlobal
     */
    private String[] getDeclaredIdentifiers_estilosSensorialGlobal() {
         return identifiers_estilosSensorialGlobal;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule estilosSensorialGlobal.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_estilosSensorialGlobal(int index) {
        switch (index) {
            case 0: return "estilo.estrutura.Estilo";
            case 1: return "estilo.estrutura.Estilo";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule estilosSensorialGlobal.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_estilosSensorialGlobal(int index) {
        switch (index) {
            case 0: return estilo.estrutura.Estilo.class;
            case 1: return estilo.estrutura.Estilo.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule estilosSensorialGlobal.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_estilosSensorialGlobal(int index, Object value) {
        switch (index) {
            case 0: this.estilo_estrutura_Estilo_1 = (estilo.estrutura.Estilo) value; break;
            case 1: this.estilo_estrutura_Estilo_2 = (estilo.estrutura.Estilo) value; break;
        }
    }

    /**
     * Returns an object declared in the rule estilosSensorialGlobal.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_estilosSensorialGlobal(int index) {
        switch (index) {
            case 0: return estilo_estrutura_Estilo_1;
            case 1: return estilo_estrutura_Estilo_2;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule estilosSensorialGlobal
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_estilosSensorialGlobal() {
        return new Object[] {
                            estilo_estrutura_Estilo_1,
                            estilo_estrutura_Estilo_2
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule estilosSensorialGlobal
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_estilosSensorialGlobal(Object[] objects) {
        estilo_estrutura_Estilo_1 = (estilo.estrutura.Estilo) objects[0];
        estilo_estrutura_Estilo_2 = (estilo.estrutura.Estilo) objects[1];
    }

    /**
     * Condition 0 of rule estilosSensorialGlobal.<p>
     * The original expression was:<br>
     * <code>e1.getEstiloNome().equalsIgnoreCase("Sensorial")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean estilosSensorialGlobal_cond_0() {
        return (estilo_estrutura_Estilo_1.getEstiloNome().equalsIgnoreCase("Sensorial"));
    }

    /**
     * Condition 1 of rule estilosSensorialGlobal.<p>
     * The original expression was:<br>
     * <code>e2.getEstiloNome().equalsIgnoreCase("Global")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean estilosSensorialGlobal_cond_1() {
        return (estilo_estrutura_Estilo_2.getEstiloNome().equalsIgnoreCase("Global"));
    }

    /**
     * Checks whether some conditions of rule estilosSensorialGlobal is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean estilosSensorialGlobal_cond(int index) {
        switch (index) {
            case 0: return estilosSensorialGlobal_cond_0();
            case 1: return estilosSensorialGlobal_cond_1();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule estilosSensorialGlobal that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_estilosSensorialGlobal(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!estilosSensorialGlobal_cond_0()) return false;
                return true;
            case 1:
                if (!estilosSensorialGlobal_cond_1()) return false;
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
    private boolean checkCondForDeclaration_estilosSensorialGlobal(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            case 1:
                return true;
            default: return false;
        }
    }

    /**
     * Executes the action part of the rule estilosSensorialGlobal
     */
    private void estilosSensorialGlobal() {
	  System.out.println(" Ativou a regra para os estilos Sensorial e Global");
	  
	  OrdemComposicao ordemComposicao1 = new OrdemComposicao();
      ordemComposicao1.getOrdem().add(new EtapaConteudo("Resumo"));
      ordemComposicao1.getOrdem().add(new EtapaConteudo("Introdução"));
      ordemComposicao1.getOrdem().add(new EtapaConteudo("Desenvolvimento"));
      ordemComposicao1.getOrdem().add(new EtapaConteudo("Atividade"));
      ordemComposicao1.getOrdem().add(new EtapaConteudo("Avaliação"));
	  
	  OrdemComposicao ordemComposicao2 = new OrdemComposicao();
	  ordemComposicao2.getOrdem().add(new EtapaConteudo("Resumo"));
	  ordemComposicao2.getOrdem().add(new EtapaConteudo("Introdução"));
	  ordemComposicao2.getOrdem().add(new EtapaConteudo("Desenvolvimento"));
	  ordemComposicao2.getOrdem().add(new EtapaConteudo("Atividade"));
	  ordemComposicao2.getOrdem().add(new EtapaConteudo("Avaliação"));
	  
	  ArrayList<RecursoEstilo> recursos = new ArrayList<RecursoEstilo>();
	  recursos.add(new Diagrama());
	  recursos.add(new Video());
	  recursos.add(new Grafico());
	  recursos.add(new Narracao());
	  recursos.add(new Slide());
	  recursos.add(new AutoAvaliacao());
	  recursos.add(new Tabela());
	  recursos.add(new Figura());
	  recursos.add(new Experimento());
	  recursos.add(new Exercicio());
	  recursos.add(new Questionario());	  
	  recursos.add(new PaginaWeb());
	  recursos.add(new Mapa());
	  recursos.add(new Demonstracao());
	  recursos.add(new Exemplo());
	  recursos.add(new Esquema());
	  	  
	  estilo_estrutura_Estilo_1.setRecursos(recursos);
	  estilo_estrutura_Estilo_2.setRecursos(recursos);

	  estilo_estrutura_Estilo_1.setFormaExploracao(new FormaExploracao("Linear"));
	  estilo_estrutura_Estilo_1.setOrdemDetalhamento(new OrdemDetalhamento("Específico para geral"));
	  estilo_estrutura_Estilo_1.setOrdemComposicao(ordemComposicao1);
	  modified(estilo_estrutura_Estilo_1);

	  estilo_estrutura_Estilo_2.setFormaExploracao(new FormaExploracao("Rede"));
	  estilo_estrutura_Estilo_2.setOrdemDetalhamento(new OrdemDetalhamento("Geral para Específico"));
	  estilo_estrutura_Estilo_2.setOrdemComposicao(ordemComposicao2);
	  modified(estilo_estrutura_Estilo_2);
	  	  
	  flush();
  
      }



  
    /**
     * Identifiers of rule estilosIntuitivoVerbal
     */
    private String[] identifiers_estilosIntuitivoVerbal = {
        "e1",
        "e2"
    };

    /**
     * Returns the identifiers declared in rule estilosIntuitivoVerbal
     *
     * @return the identifiers declared in rule estilosIntuitivoVerbal
     */
    private String[] getDeclaredIdentifiers_estilosIntuitivoVerbal() {
         return identifiers_estilosIntuitivoVerbal;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule estilosIntuitivoVerbal.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_estilosIntuitivoVerbal(int index) {
        switch (index) {
            case 0: return "estilo.estrutura.Estilo";
            case 1: return "estilo.estrutura.Estilo";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule estilosIntuitivoVerbal.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_estilosIntuitivoVerbal(int index) {
        switch (index) {
            case 0: return estilo.estrutura.Estilo.class;
            case 1: return estilo.estrutura.Estilo.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule estilosIntuitivoVerbal.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_estilosIntuitivoVerbal(int index, Object value) {
        switch (index) {
            case 0: this.estilo_estrutura_Estilo_1 = (estilo.estrutura.Estilo) value; break;
            case 1: this.estilo_estrutura_Estilo_2 = (estilo.estrutura.Estilo) value; break;
        }
    }

    /**
     * Returns an object declared in the rule estilosIntuitivoVerbal.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_estilosIntuitivoVerbal(int index) {
        switch (index) {
            case 0: return estilo_estrutura_Estilo_1;
            case 1: return estilo_estrutura_Estilo_2;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule estilosIntuitivoVerbal
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_estilosIntuitivoVerbal() {
        return new Object[] {
                            estilo_estrutura_Estilo_1,
                            estilo_estrutura_Estilo_2
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule estilosIntuitivoVerbal
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_estilosIntuitivoVerbal(Object[] objects) {
        estilo_estrutura_Estilo_1 = (estilo.estrutura.Estilo) objects[0];
        estilo_estrutura_Estilo_2 = (estilo.estrutura.Estilo) objects[1];
    }

    /**
     * Condition 0 of rule estilosIntuitivoVerbal.<p>
     * The original expression was:<br>
     * <code>e1.getEstiloNome().equalsIgnoreCase("Intuitivo")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean estilosIntuitivoVerbal_cond_0() {
        return (estilo_estrutura_Estilo_1.getEstiloNome().equalsIgnoreCase("Intuitivo"));
    }

    /**
     * Condition 1 of rule estilosIntuitivoVerbal.<p>
     * The original expression was:<br>
     * <code>e2.getEstiloNome().equalsIgnoreCase("Verbal")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean estilosIntuitivoVerbal_cond_1() {
        return (estilo_estrutura_Estilo_2.getEstiloNome().equalsIgnoreCase("Verbal"));
    }

    /**
     * Checks whether some conditions of rule estilosIntuitivoVerbal is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean estilosIntuitivoVerbal_cond(int index) {
        switch (index) {
            case 0: return estilosIntuitivoVerbal_cond_0();
            case 1: return estilosIntuitivoVerbal_cond_1();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule estilosIntuitivoVerbal that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_estilosIntuitivoVerbal(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!estilosIntuitivoVerbal_cond_0()) return false;
                return true;
            case 1:
                if (!estilosIntuitivoVerbal_cond_1()) return false;
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
    private boolean checkCondForDeclaration_estilosIntuitivoVerbal(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            case 1:
                return true;
            default: return false;
        }
    }

    /**
     * Executes the action part of the rule estilosIntuitivoVerbal
     */
    private void estilosIntuitivoVerbal() {
	  System.out.println(" Ativou a regra para os estilos Intuitivo e Verbal");
	  
	  OrdemComposicao ordemComposicao1 = new OrdemComposicao();
	  ordemComposicao1.getOrdem().add(new EtapaConteudo("Introdução"));
	  ordemComposicao1.getOrdem().add(new EtapaConteudo("Desenvolvimento"));
	  ordemComposicao1.getOrdem().add(new EtapaConteudo("Resumo"));
	  ordemComposicao1.getOrdem().add(new EtapaConteudo("Atividade"));
	  ordemComposicao1.getOrdem().add(new EtapaConteudo("Avaliação"));
	  
	  OrdemComposicao ordemComposicao2 = new OrdemComposicao();
	  ordemComposicao2.getOrdem().add(new EtapaConteudo("Resumo"));
	  ordemComposicao2.getOrdem().add(new EtapaConteudo("Introdução"));
	  ordemComposicao2.getOrdem().add(new EtapaConteudo("Desenvolvimento"));
	  ordemComposicao2.getOrdem().add(new EtapaConteudo("Atividade"));
	  ordemComposicao2.getOrdem().add(new EtapaConteudo("Avaliação"));
	  
	  ArrayList<RecursoEstilo> recursos = new ArrayList<RecursoEstilo>();
	  recursos.add(new Diagrama());
	  recursos.add(new Grafico());
	  recursos.add(new Figura());
	  recursos.add(new Narracao());
	  recursos.add(new Palestra());
	  recursos.add(new Slide());
	  recursos.add(new Tabela());
	  recursos.add(new AutoAvaliacao());
	  recursos.add(new PaginaWeb());
	  recursos.add(new Exercicio());
	  recursos.add(new Simulacao());
	  recursos.add(new Questionario());	  
	  recursos.add(new Animacao());
	  recursos.add(new Foto());
	  recursos.add(new Exemplo());
	  recursos.add(new Demonstracao());
	  	  
	  estilo_estrutura_Estilo_1.setRecursos(recursos);
	  estilo_estrutura_Estilo_2.setRecursos(recursos);
	  

	  estilo_estrutura_Estilo_1.setFormaExploracao(new FormaExploracao("Rede"));
	  estilo_estrutura_Estilo_1.setOrdemDetalhamento(new OrdemDetalhamento("Geral para Específico"));
	  estilo_estrutura_Estilo_1.setOrdemComposicao(ordemComposicao1);
	  modified(estilo_estrutura_Estilo_1);
	  
	  estilo_estrutura_Estilo_2.setFormaExploracao(new FormaExploracao("Linear"));
	  estilo_estrutura_Estilo_2.setOrdemDetalhamento(new OrdemDetalhamento("Específico para geral"));
	  estilo_estrutura_Estilo_2.setOrdemComposicao(ordemComposicao2);
	  modified(estilo_estrutura_Estilo_2);
	  	  
	  flush();
  
      }




  
    /**
     * Identifiers of rule estilosIntuitivoVisual
     */
    private String[] identifiers_estilosIntuitivoVisual = {
        "e1",
        "e2"
    };

    /**
     * Returns the identifiers declared in rule estilosIntuitivoVisual
     *
     * @return the identifiers declared in rule estilosIntuitivoVisual
     */
    private String[] getDeclaredIdentifiers_estilosIntuitivoVisual() {
         return identifiers_estilosIntuitivoVisual;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule estilosIntuitivoVisual.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_estilosIntuitivoVisual(int index) {
        switch (index) {
            case 0: return "estilo.estrutura.Estilo";
            case 1: return "estilo.estrutura.Estilo";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule estilosIntuitivoVisual.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_estilosIntuitivoVisual(int index) {
        switch (index) {
            case 0: return estilo.estrutura.Estilo.class;
            case 1: return estilo.estrutura.Estilo.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule estilosIntuitivoVisual.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_estilosIntuitivoVisual(int index, Object value) {
        switch (index) {
            case 0: this.estilo_estrutura_Estilo_1 = (estilo.estrutura.Estilo) value; break;
            case 1: this.estilo_estrutura_Estilo_2 = (estilo.estrutura.Estilo) value; break;
        }
    }

    /**
     * Returns an object declared in the rule estilosIntuitivoVisual.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_estilosIntuitivoVisual(int index) {
        switch (index) {
            case 0: return estilo_estrutura_Estilo_1;
            case 1: return estilo_estrutura_Estilo_2;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule estilosIntuitivoVisual
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_estilosIntuitivoVisual() {
        return new Object[] {
                            estilo_estrutura_Estilo_1,
                            estilo_estrutura_Estilo_2
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule estilosIntuitivoVisual
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_estilosIntuitivoVisual(Object[] objects) {
        estilo_estrutura_Estilo_1 = (estilo.estrutura.Estilo) objects[0];
        estilo_estrutura_Estilo_2 = (estilo.estrutura.Estilo) objects[1];
    }

    /**
     * Condition 0 of rule estilosIntuitivoVisual.<p>
     * The original expression was:<br>
     * <code>e1.getEstiloNome().equalsIgnoreCase("Intuitivo")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean estilosIntuitivoVisual_cond_0() {
        return (estilo_estrutura_Estilo_1.getEstiloNome().equalsIgnoreCase("Intuitivo"));
    }

    /**
     * Condition 1 of rule estilosIntuitivoVisual.<p>
     * The original expression was:<br>
     * <code>e2.getEstiloNome().equalsIgnoreCase("Visual")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean estilosIntuitivoVisual_cond_1() {
        return (estilo_estrutura_Estilo_2.getEstiloNome().equalsIgnoreCase("Visual"));
    }

    /**
     * Checks whether some conditions of rule estilosIntuitivoVisual is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean estilosIntuitivoVisual_cond(int index) {
        switch (index) {
            case 0: return estilosIntuitivoVisual_cond_0();
            case 1: return estilosIntuitivoVisual_cond_1();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule estilosIntuitivoVisual that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_estilosIntuitivoVisual(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!estilosIntuitivoVisual_cond_0()) return false;
                return true;
            case 1:
                if (!estilosIntuitivoVisual_cond_1()) return false;
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
    private boolean checkCondForDeclaration_estilosIntuitivoVisual(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            case 1:
                return true;
            default: return false;
        }
    }

    /**
     * Executes the action part of the rule estilosIntuitivoVisual
     */
    private void estilosIntuitivoVisual() {
	  System.out.println(" Ativou a regra para os estilos Intuitivo e Visual");
	  
	  OrdemComposicao ordemComposicao1 = new OrdemComposicao();
	  ordemComposicao1.getOrdem().add(new EtapaConteudo("Introdução"));
	  ordemComposicao1.getOrdem().add(new EtapaConteudo("Desenvolvimento"));
	  ordemComposicao1.getOrdem().add(new EtapaConteudo("Resumo"));
	  ordemComposicao1.getOrdem().add(new EtapaConteudo("Atividade"));
	  ordemComposicao1.getOrdem().add(new EtapaConteudo("Avaliação"));
	  
	  OrdemComposicao ordemComposicao2 = new OrdemComposicao();
	  ordemComposicao2.getOrdem().add(new EtapaConteudo("Resumo"));
	  ordemComposicao2.getOrdem().add(new EtapaConteudo("Introdução"));
	  ordemComposicao2.getOrdem().add(new EtapaConteudo("Desenvolvimento"));
	  ordemComposicao2.getOrdem().add(new EtapaConteudo("Atividade"));
	  ordemComposicao2.getOrdem().add(new EtapaConteudo("Avaliação"));
	  
	  ArrayList<RecursoEstilo> recursos = new ArrayList<RecursoEstilo>();
	  recursos.add(new Video());
	  recursos.add(new Grafico());
	  recursos.add(new Figura());
	  recursos.add(new Narracao());
	  recursos.add(new Palestra());
	  recursos.add(new Slide());
	  recursos.add(new AutoAvaliacao());
	  recursos.add(new Diagrama());
	  recursos.add(new Tabela());
	  recursos.add(new Exercicio());
	  recursos.add(new Simulacao());
	  recursos.add(new Questionario());	  
	  recursos.add(new Animacao());
	  recursos.add(new Foto());
	  recursos.add(new PaginaWeb());
	  recursos.add(new Demonstracao());
	  recursos.add(new Exemplo());
	  recursos.add(new Experimento());	  
	  	  
	  estilo_estrutura_Estilo_1.setRecursos(recursos);
	  estilo_estrutura_Estilo_2.setRecursos(recursos);
	  

	  estilo_estrutura_Estilo_1.setFormaExploracao(new FormaExploracao("Rede"));
	  estilo_estrutura_Estilo_1.setOrdemDetalhamento(new OrdemDetalhamento("Geral para Específico"));
	  estilo_estrutura_Estilo_1.setOrdemComposicao(ordemComposicao1);
	  modified(estilo_estrutura_Estilo_1);
	  
	  estilo_estrutura_Estilo_2.setFormaExploracao(new FormaExploracao("Rede"));
	  estilo_estrutura_Estilo_2.setOrdemDetalhamento(new OrdemDetalhamento("Geral para Específico"));
	  estilo_estrutura_Estilo_2.setOrdemComposicao(ordemComposicao2);
	  modified(estilo_estrutura_Estilo_2);
	  	  
	  flush();
  
      }



  
    /**
     * Identifiers of rule estilosIntuitivoSequencial
     */
    private String[] identifiers_estilosIntuitivoSequencial = {
        "e1",
        "e2"
    };

    /**
     * Returns the identifiers declared in rule estilosIntuitivoSequencial
     *
     * @return the identifiers declared in rule estilosIntuitivoSequencial
     */
    private String[] getDeclaredIdentifiers_estilosIntuitivoSequencial() {
         return identifiers_estilosIntuitivoSequencial;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule estilosIntuitivoSequencial.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_estilosIntuitivoSequencial(int index) {
        switch (index) {
            case 0: return "estilo.estrutura.Estilo";
            case 1: return "estilo.estrutura.Estilo";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule estilosIntuitivoSequencial.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_estilosIntuitivoSequencial(int index) {
        switch (index) {
            case 0: return estilo.estrutura.Estilo.class;
            case 1: return estilo.estrutura.Estilo.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule estilosIntuitivoSequencial.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_estilosIntuitivoSequencial(int index, Object value) {
        switch (index) {
            case 0: this.estilo_estrutura_Estilo_1 = (estilo.estrutura.Estilo) value; break;
            case 1: this.estilo_estrutura_Estilo_2 = (estilo.estrutura.Estilo) value; break;
        }
    }

    /**
     * Returns an object declared in the rule estilosIntuitivoSequencial.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_estilosIntuitivoSequencial(int index) {
        switch (index) {
            case 0: return estilo_estrutura_Estilo_1;
            case 1: return estilo_estrutura_Estilo_2;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule estilosIntuitivoSequencial
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_estilosIntuitivoSequencial() {
        return new Object[] {
                            estilo_estrutura_Estilo_1,
                            estilo_estrutura_Estilo_2
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule estilosIntuitivoSequencial
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_estilosIntuitivoSequencial(Object[] objects) {
        estilo_estrutura_Estilo_1 = (estilo.estrutura.Estilo) objects[0];
        estilo_estrutura_Estilo_2 = (estilo.estrutura.Estilo) objects[1];
    }

    /**
     * Condition 0 of rule estilosIntuitivoSequencial.<p>
     * The original expression was:<br>
     * <code>e1.getEstiloNome().equalsIgnoreCase("Intuitivo")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean estilosIntuitivoSequencial_cond_0() {
        return (estilo_estrutura_Estilo_1.getEstiloNome().equalsIgnoreCase("Intuitivo"));
    }

    /**
     * Condition 1 of rule estilosIntuitivoSequencial.<p>
     * The original expression was:<br>
     * <code>e2.getEstiloNome().equalsIgnoreCase("Sequencial")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean estilosIntuitivoSequencial_cond_1() {
        return (estilo_estrutura_Estilo_2.getEstiloNome().equalsIgnoreCase("Sequencial"));
    }

    /**
     * Checks whether some conditions of rule estilosIntuitivoSequencial is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean estilosIntuitivoSequencial_cond(int index) {
        switch (index) {
            case 0: return estilosIntuitivoSequencial_cond_0();
            case 1: return estilosIntuitivoSequencial_cond_1();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule estilosIntuitivoSequencial that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_estilosIntuitivoSequencial(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!estilosIntuitivoSequencial_cond_0()) return false;
                return true;
            case 1:
                if (!estilosIntuitivoSequencial_cond_1()) return false;
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
    private boolean checkCondForDeclaration_estilosIntuitivoSequencial(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            case 1:
                return true;
            default: return false;
        }
    }

    /**
     * Executes the action part of the rule estilosIntuitivoSequencial
     */
    private void estilosIntuitivoSequencial() {
	  System.out.println(" Ativou a regra para os estilos Intuitivo e Sequencial");
	  
	  OrdemComposicao ordemComposicao1 = new OrdemComposicao();
	  ordemComposicao1.getOrdem().add(new EtapaConteudo("Introdução"));
	  ordemComposicao1.getOrdem().add(new EtapaConteudo("Desenvolvimento"));
	  ordemComposicao1.getOrdem().add(new EtapaConteudo("Resumo"));
	  ordemComposicao1.getOrdem().add(new EtapaConteudo("Atividade"));
	  ordemComposicao1.getOrdem().add(new EtapaConteudo("Avaliação"));
	  
	  OrdemComposicao ordemComposicao2 = new OrdemComposicao();
	  ordemComposicao2.getOrdem().add(new EtapaConteudo("Introdução"));
	  ordemComposicao2.getOrdem().add(new EtapaConteudo("Desenvolvimento"));
	  ordemComposicao2.getOrdem().add(new EtapaConteudo("Atividade"));
	  ordemComposicao2.getOrdem().add(new EtapaConteudo("Resumo"));
	  ordemComposicao2.getOrdem().add(new EtapaConteudo("Avaliação"));
	  
	  ArrayList<RecursoEstilo> recursos = new ArrayList<RecursoEstilo>();
	  recursos.add(new Diagrama());
	  recursos.add(new Grafico());
	  recursos.add(new Figura());
	  recursos.add(new Narracao());
	  recursos.add(new Palestra());
	  recursos.add(new Slide());
	  recursos.add(new Esquema());
	  recursos.add(new AutoAvaliacao());
	  recursos.add(new Exercicio());
	  recursos.add(new Simulacao());
	  recursos.add(new Questionario());	  
	  recursos.add(new Animacao());
	  recursos.add(new Foto());
	  recursos.add(new Exemplo());
	  recursos.add(new PaginaWeb());
	  recursos.add(new Demonstracao());
	  
	  estilo_estrutura_Estilo_1.setRecursos(recursos);
	  estilo_estrutura_Estilo_2.setRecursos(recursos);
	  

	  estilo_estrutura_Estilo_1.setFormaExploracao(new FormaExploracao("Rede"));
	  estilo_estrutura_Estilo_1.setOrdemDetalhamento(new OrdemDetalhamento("Geral para Específico"));
	  estilo_estrutura_Estilo_1.setOrdemComposicao(ordemComposicao1);
	  modified(estilo_estrutura_Estilo_1);
	  
	  estilo_estrutura_Estilo_2.setFormaExploracao(new FormaExploracao("Linear"));
	  estilo_estrutura_Estilo_2.setOrdemDetalhamento(new OrdemDetalhamento("Específico para geral"));
	  estilo_estrutura_Estilo_2.setOrdemComposicao(ordemComposicao2);
	  modified(estilo_estrutura_Estilo_2);
	  	  
	  flush();
  
      }


    

  
    /**
     * Identifiers of rule estilosIntuitivoGlobal
     */
    private String[] identifiers_estilosIntuitivoGlobal = {
        "e1",
        "e2"
    };

    /**
     * Returns the identifiers declared in rule estilosIntuitivoGlobal
     *
     * @return the identifiers declared in rule estilosIntuitivoGlobal
     */
    private String[] getDeclaredIdentifiers_estilosIntuitivoGlobal() {
         return identifiers_estilosIntuitivoGlobal;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule estilosIntuitivoGlobal.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_estilosIntuitivoGlobal(int index) {
        switch (index) {
            case 0: return "estilo.estrutura.Estilo";
            case 1: return "estilo.estrutura.Estilo";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule estilosIntuitivoGlobal.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_estilosIntuitivoGlobal(int index) {
        switch (index) {
            case 0: return estilo.estrutura.Estilo.class;
            case 1: return estilo.estrutura.Estilo.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule estilosIntuitivoGlobal.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_estilosIntuitivoGlobal(int index, Object value) {
        switch (index) {
            case 0: this.estilo_estrutura_Estilo_1 = (estilo.estrutura.Estilo) value; break;
            case 1: this.estilo_estrutura_Estilo_2 = (estilo.estrutura.Estilo) value; break;
        }
    }

    /**
     * Returns an object declared in the rule estilosIntuitivoGlobal.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_estilosIntuitivoGlobal(int index) {
        switch (index) {
            case 0: return estilo_estrutura_Estilo_1;
            case 1: return estilo_estrutura_Estilo_2;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule estilosIntuitivoGlobal
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_estilosIntuitivoGlobal() {
        return new Object[] {
                            estilo_estrutura_Estilo_1,
                            estilo_estrutura_Estilo_2
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule estilosIntuitivoGlobal
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_estilosIntuitivoGlobal(Object[] objects) {
        estilo_estrutura_Estilo_1 = (estilo.estrutura.Estilo) objects[0];
        estilo_estrutura_Estilo_2 = (estilo.estrutura.Estilo) objects[1];
    }

    /**
     * Condition 0 of rule estilosIntuitivoGlobal.<p>
     * The original expression was:<br>
     * <code>e1.getEstiloNome().equalsIgnoreCase("Intuitivo")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean estilosIntuitivoGlobal_cond_0() {
        return (estilo_estrutura_Estilo_1.getEstiloNome().equalsIgnoreCase("Intuitivo"));
    }

    /**
     * Condition 1 of rule estilosIntuitivoGlobal.<p>
     * The original expression was:<br>
     * <code>e2.getEstiloNome().equalsIgnoreCase("Global")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean estilosIntuitivoGlobal_cond_1() {
        return (estilo_estrutura_Estilo_2.getEstiloNome().equalsIgnoreCase("Global"));
    }

    /**
     * Checks whether some conditions of rule estilosIntuitivoGlobal is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean estilosIntuitivoGlobal_cond(int index) {
        switch (index) {
            case 0: return estilosIntuitivoGlobal_cond_0();
            case 1: return estilosIntuitivoGlobal_cond_1();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule estilosIntuitivoGlobal that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_estilosIntuitivoGlobal(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!estilosIntuitivoGlobal_cond_0()) return false;
                return true;
            case 1:
                if (!estilosIntuitivoGlobal_cond_1()) return false;
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
    private boolean checkCondForDeclaration_estilosIntuitivoGlobal(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            case 1:
                return true;
            default: return false;
        }
    }

    /**
     * Executes the action part of the rule estilosIntuitivoGlobal
     */
    private void estilosIntuitivoGlobal() {
	  System.out.println(" Ativou a regra para os estilos Intuitivo e Global");
	  
	  OrdemComposicao ordemComposicao1 = new OrdemComposicao();
	  ordemComposicao1.getOrdem().add(new EtapaConteudo("Introdução"));
	  ordemComposicao1.getOrdem().add(new EtapaConteudo("Desenvolvimento"));
	  ordemComposicao1.getOrdem().add(new EtapaConteudo("Resumo"));
	  ordemComposicao1.getOrdem().add(new EtapaConteudo("Atividade"));
	  ordemComposicao1.getOrdem().add(new EtapaConteudo("Avaliação"));
	  
	  OrdemComposicao ordemComposicao2 = new OrdemComposicao();
	  ordemComposicao2.getOrdem().add(new EtapaConteudo("Resumo"));
	  ordemComposicao2.getOrdem().add(new EtapaConteudo("Introdução"));
	  ordemComposicao2.getOrdem().add(new EtapaConteudo("Desenvolvimento"));
	  ordemComposicao2.getOrdem().add(new EtapaConteudo("Atividade"));
	  ordemComposicao2.getOrdem().add(new EtapaConteudo("Avaliação"));
	  
	  ArrayList<RecursoEstilo> recursos = new ArrayList<RecursoEstilo>();
	  recursos.add(new Diagrama());
	  recursos.add(new Grafico());
	  recursos.add(new Figura());
	  recursos.add(new Narracao());
	  recursos.add(new Palestra());
	  recursos.add(new Slide());
	  recursos.add(new Experimento());
	  recursos.add(new AutoAvaliacao());
	  recursos.add(new Esquema());
	  recursos.add(new PaginaWeb());
	  recursos.add(new Exercicio());
	  recursos.add(new Foto());
	  recursos.add(new Simulacao());
	  recursos.add(new Questionario());	  
	  recursos.add(new Animacao());
	  recursos.add(new Exemplo());
	  recursos.add(new Mapa());
	  
	  
	  estilo_estrutura_Estilo_1.setRecursos(recursos);
	  estilo_estrutura_Estilo_2.setRecursos(recursos);
	  

	  estilo_estrutura_Estilo_1.setFormaExploracao(new FormaExploracao("Rede"));
	  estilo_estrutura_Estilo_1.setOrdemDetalhamento(new OrdemDetalhamento("Geral para Específico"));
	  estilo_estrutura_Estilo_1.setOrdemComposicao(ordemComposicao1);
	  modified(estilo_estrutura_Estilo_1);
	  
	  estilo_estrutura_Estilo_2.setFormaExploracao(new FormaExploracao("Rede"));
	  estilo_estrutura_Estilo_2.setOrdemDetalhamento(new OrdemDetalhamento("Geral para Específico"));
	  estilo_estrutura_Estilo_2.setOrdemComposicao(ordemComposicao2);
	  modified(estilo_estrutura_Estilo_2);
	  	  
	  flush();
  
      }


    

  
    /**
     * Identifiers of rule estilosVisualSequencial
     */
    private String[] identifiers_estilosVisualSequencial = {
        "e1",
        "e2"
    };

    /**
     * Returns the identifiers declared in rule estilosVisualSequencial
     *
     * @return the identifiers declared in rule estilosVisualSequencial
     */
    private String[] getDeclaredIdentifiers_estilosVisualSequencial() {
         return identifiers_estilosVisualSequencial;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule estilosVisualSequencial.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_estilosVisualSequencial(int index) {
        switch (index) {
            case 0: return "estilo.estrutura.Estilo";
            case 1: return "estilo.estrutura.Estilo";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule estilosVisualSequencial.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_estilosVisualSequencial(int index) {
        switch (index) {
            case 0: return estilo.estrutura.Estilo.class;
            case 1: return estilo.estrutura.Estilo.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule estilosVisualSequencial.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_estilosVisualSequencial(int index, Object value) {
        switch (index) {
            case 0: this.estilo_estrutura_Estilo_1 = (estilo.estrutura.Estilo) value; break;
            case 1: this.estilo_estrutura_Estilo_2 = (estilo.estrutura.Estilo) value; break;
        }
    }

    /**
     * Returns an object declared in the rule estilosVisualSequencial.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_estilosVisualSequencial(int index) {
        switch (index) {
            case 0: return estilo_estrutura_Estilo_1;
            case 1: return estilo_estrutura_Estilo_2;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule estilosVisualSequencial
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_estilosVisualSequencial() {
        return new Object[] {
                            estilo_estrutura_Estilo_1,
                            estilo_estrutura_Estilo_2
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule estilosVisualSequencial
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_estilosVisualSequencial(Object[] objects) {
        estilo_estrutura_Estilo_1 = (estilo.estrutura.Estilo) objects[0];
        estilo_estrutura_Estilo_2 = (estilo.estrutura.Estilo) objects[1];
    }

    /**
     * Condition 0 of rule estilosVisualSequencial.<p>
     * The original expression was:<br>
     * <code>e1.getEstiloNome().equalsIgnoreCase("Visual")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean estilosVisualSequencial_cond_0() {
        return (estilo_estrutura_Estilo_1.getEstiloNome().equalsIgnoreCase("Visual"));
    }

    /**
     * Condition 1 of rule estilosVisualSequencial.<p>
     * The original expression was:<br>
     * <code>e2.getEstiloNome().equalsIgnoreCase("Sequencial")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean estilosVisualSequencial_cond_1() {
        return (estilo_estrutura_Estilo_2.getEstiloNome().equalsIgnoreCase("Sequencial"));
    }

    /**
     * Checks whether some conditions of rule estilosVisualSequencial is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean estilosVisualSequencial_cond(int index) {
        switch (index) {
            case 0: return estilosVisualSequencial_cond_0();
            case 1: return estilosVisualSequencial_cond_1();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule estilosVisualSequencial that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_estilosVisualSequencial(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!estilosVisualSequencial_cond_0()) return false;
                return true;
            case 1:
                if (!estilosVisualSequencial_cond_1()) return false;
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
    private boolean checkCondForDeclaration_estilosVisualSequencial(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            case 1:
                return true;
            default: return false;
        }
    }

    /**
     * Executes the action part of the rule estilosVisualSequencial
     */
    private void estilosVisualSequencial() {
	  System.out.println(" Ativou a regra para os estilos Visual e Sequencial");
	  
	  OrdemComposicao ordemComposicao1 = new OrdemComposicao();
	  ordemComposicao1.getOrdem().add(new EtapaConteudo("Resumo"));
	  ordemComposicao1.getOrdem().add(new EtapaConteudo("Introdução"));
	  ordemComposicao1.getOrdem().add(new EtapaConteudo("Desenvolvimento"));
	  ordemComposicao1.getOrdem().add(new EtapaConteudo("Atividade"));
	  ordemComposicao1.getOrdem().add(new EtapaConteudo("Avaliação"));
	  
	  OrdemComposicao ordemComposicao2 = new OrdemComposicao();
	  ordemComposicao2.getOrdem().add(new EtapaConteudo("Introdução"));
	  ordemComposicao2.getOrdem().add(new EtapaConteudo("Desenvolvimento"));
	  ordemComposicao2.getOrdem().add(new EtapaConteudo("Atividade"));
	  ordemComposicao2.getOrdem().add(new EtapaConteudo("Resumo"));
	  ordemComposicao2.getOrdem().add(new EtapaConteudo("Avaliação"));
	  

	  ArrayList<RecursoEstilo> recursos = new ArrayList<RecursoEstilo>();
	  recursos.add(new Video());
	  recursos.add(new Diagrama());
	  recursos.add(new Grafico());
	  recursos.add(new Narracao());
	  recursos.add(new Figura());
	  recursos.add(new Slide());
	  recursos.add(new Palestra());
	  recursos.add(new Mapa());
	  recursos.add(new AutoAvaliacao());
	  recursos.add(new Esquema());
	  recursos.add(new Tabela());
	  recursos.add(new Experimento());
	  recursos.add(new Exercicio());
	  recursos.add(new Simulacao());
	  recursos.add(new Animacao());
	  recursos.add(new Foto());
	  recursos.add(new PaginaWeb());
	  recursos.add(new Questionario());	  
	  recursos.add(new Demonstracao());
	  recursos.add(new Exemplo());
	  	  
	  
	  estilo_estrutura_Estilo_1.setRecursos(recursos);
	  estilo_estrutura_Estilo_2.setRecursos(recursos);
	  

	  estilo_estrutura_Estilo_1.setFormaExploracao(new FormaExploracao("Rede"));
	  estilo_estrutura_Estilo_1.setOrdemDetalhamento(new OrdemDetalhamento("Geral para Específico"));
	  estilo_estrutura_Estilo_1.setOrdemComposicao(ordemComposicao1);
	  modified(estilo_estrutura_Estilo_1);
	  
	  estilo_estrutura_Estilo_2.setFormaExploracao(new FormaExploracao("Linear"));
	  estilo_estrutura_Estilo_2.setOrdemDetalhamento(new OrdemDetalhamento("Específico para geral"));
	  estilo_estrutura_Estilo_2.setOrdemComposicao(ordemComposicao2);
	  modified(estilo_estrutura_Estilo_2);
	  	  
	  flush();
  
      }




  
    /**
     * Identifiers of rule estilosVisualGlobal
     */
    private String[] identifiers_estilosVisualGlobal = {
        "e1",
        "e2"
    };

    /**
     * Returns the identifiers declared in rule estilosVisualGlobal
     *
     * @return the identifiers declared in rule estilosVisualGlobal
     */
    private String[] getDeclaredIdentifiers_estilosVisualGlobal() {
         return identifiers_estilosVisualGlobal;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule estilosVisualGlobal.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_estilosVisualGlobal(int index) {
        switch (index) {
            case 0: return "estilo.estrutura.Estilo";
            case 1: return "estilo.estrutura.Estilo";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule estilosVisualGlobal.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_estilosVisualGlobal(int index) {
        switch (index) {
            case 0: return estilo.estrutura.Estilo.class;
            case 1: return estilo.estrutura.Estilo.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule estilosVisualGlobal.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_estilosVisualGlobal(int index, Object value) {
        switch (index) {
            case 0: this.estilo_estrutura_Estilo_1 = (estilo.estrutura.Estilo) value; break;
            case 1: this.estilo_estrutura_Estilo_2 = (estilo.estrutura.Estilo) value; break;
        }
    }

    /**
     * Returns an object declared in the rule estilosVisualGlobal.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_estilosVisualGlobal(int index) {
        switch (index) {
            case 0: return estilo_estrutura_Estilo_1;
            case 1: return estilo_estrutura_Estilo_2;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule estilosVisualGlobal
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_estilosVisualGlobal() {
        return new Object[] {
                            estilo_estrutura_Estilo_1,
                            estilo_estrutura_Estilo_2
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule estilosVisualGlobal
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_estilosVisualGlobal(Object[] objects) {
        estilo_estrutura_Estilo_1 = (estilo.estrutura.Estilo) objects[0];
        estilo_estrutura_Estilo_2 = (estilo.estrutura.Estilo) objects[1];
    }

    /**
     * Condition 0 of rule estilosVisualGlobal.<p>
     * The original expression was:<br>
     * <code>e1.getEstiloNome().equalsIgnoreCase("Visual")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean estilosVisualGlobal_cond_0() {
        return (estilo_estrutura_Estilo_1.getEstiloNome().equalsIgnoreCase("Visual"));
    }

    /**
     * Condition 1 of rule estilosVisualGlobal.<p>
     * The original expression was:<br>
     * <code>e2.getEstiloNome().equalsIgnoreCase("Global")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean estilosVisualGlobal_cond_1() {
        return (estilo_estrutura_Estilo_2.getEstiloNome().equalsIgnoreCase("Global"));
    }

    /**
     * Checks whether some conditions of rule estilosVisualGlobal is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean estilosVisualGlobal_cond(int index) {
        switch (index) {
            case 0: return estilosVisualGlobal_cond_0();
            case 1: return estilosVisualGlobal_cond_1();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule estilosVisualGlobal that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_estilosVisualGlobal(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!estilosVisualGlobal_cond_0()) return false;
                return true;
            case 1:
                if (!estilosVisualGlobal_cond_1()) return false;
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
    private boolean checkCondForDeclaration_estilosVisualGlobal(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            case 1:
                return true;
            default: return false;
        }
    }

    /**
     * Executes the action part of the rule estilosVisualGlobal
     */
    private void estilosVisualGlobal() {
	  System.out.println(" Ativou a regra para os estilos Visual e Global");
	  
	  OrdemComposicao ordemComposicao1 = new OrdemComposicao();
	  ordemComposicao1.getOrdem().add(new EtapaConteudo("Resumo"));
	  ordemComposicao1.getOrdem().add(new EtapaConteudo("Introdução"));
	  ordemComposicao1.getOrdem().add(new EtapaConteudo("Desenvolvimento"));
	  ordemComposicao1.getOrdem().add(new EtapaConteudo("Atividade"));
	  ordemComposicao1.getOrdem().add(new EtapaConteudo("Avaliação"));
	  
	  OrdemComposicao ordemComposicao2 = new OrdemComposicao();
	  ordemComposicao2.getOrdem().add(new EtapaConteudo("Resumo"));
	  ordemComposicao2.getOrdem().add(new EtapaConteudo("Introdução"));
	  ordemComposicao2.getOrdem().add(new EtapaConteudo("Desenvolvimento"));
	  ordemComposicao2.getOrdem().add(new EtapaConteudo("Atividade"));
	  ordemComposicao2.getOrdem().add(new EtapaConteudo("Avaliação"));

	  ArrayList<RecursoEstilo> recursos = new ArrayList<RecursoEstilo>();
	  recursos.add(new Video());
	  recursos.add(new Diagrama());
	  recursos.add(new Grafico());
	  recursos.add(new Figura());
	  recursos.add(new Slide());
	  recursos.add(new AutoAvaliacao());
	  recursos.add(new Esquema());
	  recursos.add(new Tabela());
	  recursos.add(new Experimento());
	  recursos.add(new Exercicio());
	  recursos.add(new Simulacao());
	  recursos.add(new Animacao());
	  recursos.add(new Foto());
	  recursos.add(new Mapa());
	  recursos.add(new PaginaWeb());
	  recursos.add(new Demonstracao());
	  recursos.add(new Exemplo());
	  
	  estilo_estrutura_Estilo_1.setRecursos(recursos);
	  estilo_estrutura_Estilo_2.setRecursos(recursos);
	  

	  estilo_estrutura_Estilo_1.setFormaExploracao(new FormaExploracao("Rede"));
	  estilo_estrutura_Estilo_1.setOrdemDetalhamento(new OrdemDetalhamento("Geral para Específico"));
	  estilo_estrutura_Estilo_1.setOrdemComposicao(ordemComposicao1);
	  modified(estilo_estrutura_Estilo_1);
	  
	  estilo_estrutura_Estilo_2.setFormaExploracao(new FormaExploracao("Rede"));
	  estilo_estrutura_Estilo_2.setOrdemDetalhamento(new OrdemDetalhamento("Geral para Específico"));
	  estilo_estrutura_Estilo_2.setOrdemComposicao(ordemComposicao2);
	  modified(estilo_estrutura_Estilo_2);
	  	  
	  flush();
  
      }




  
    /**
     * Identifiers of rule estilosVerbalSequencial
     */
    private String[] identifiers_estilosVerbalSequencial = {
        "e1",
        "e2"
    };

    /**
     * Returns the identifiers declared in rule estilosVerbalSequencial
     *
     * @return the identifiers declared in rule estilosVerbalSequencial
     */
    private String[] getDeclaredIdentifiers_estilosVerbalSequencial() {
         return identifiers_estilosVerbalSequencial;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule estilosVerbalSequencial.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_estilosVerbalSequencial(int index) {
        switch (index) {
            case 0: return "estilo.estrutura.Estilo";
            case 1: return "estilo.estrutura.Estilo";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule estilosVerbalSequencial.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_estilosVerbalSequencial(int index) {
        switch (index) {
            case 0: return estilo.estrutura.Estilo.class;
            case 1: return estilo.estrutura.Estilo.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule estilosVerbalSequencial.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_estilosVerbalSequencial(int index, Object value) {
        switch (index) {
            case 0: this.estilo_estrutura_Estilo_1 = (estilo.estrutura.Estilo) value; break;
            case 1: this.estilo_estrutura_Estilo_2 = (estilo.estrutura.Estilo) value; break;
        }
    }

    /**
     * Returns an object declared in the rule estilosVerbalSequencial.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_estilosVerbalSequencial(int index) {
        switch (index) {
            case 0: return estilo_estrutura_Estilo_1;
            case 1: return estilo_estrutura_Estilo_2;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule estilosVerbalSequencial
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_estilosVerbalSequencial() {
        return new Object[] {
                            estilo_estrutura_Estilo_1,
                            estilo_estrutura_Estilo_2
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule estilosVerbalSequencial
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_estilosVerbalSequencial(Object[] objects) {
        estilo_estrutura_Estilo_1 = (estilo.estrutura.Estilo) objects[0];
        estilo_estrutura_Estilo_2 = (estilo.estrutura.Estilo) objects[1];
    }

    /**
     * Condition 0 of rule estilosVerbalSequencial.<p>
     * The original expression was:<br>
     * <code>e1.getEstiloNome().equalsIgnoreCase("Verbal")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean estilosVerbalSequencial_cond_0() {
        return (estilo_estrutura_Estilo_1.getEstiloNome().equalsIgnoreCase("Verbal"));
    }

    /**
     * Condition 1 of rule estilosVerbalSequencial.<p>
     * The original expression was:<br>
     * <code>e2.getEstiloNome().equalsIgnoreCase("Sequencial")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean estilosVerbalSequencial_cond_1() {
        return (estilo_estrutura_Estilo_2.getEstiloNome().equalsIgnoreCase("Sequencial"));
    }

    /**
     * Checks whether some conditions of rule estilosVerbalSequencial is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean estilosVerbalSequencial_cond(int index) {
        switch (index) {
            case 0: return estilosVerbalSequencial_cond_0();
            case 1: return estilosVerbalSequencial_cond_1();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule estilosVerbalSequencial that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_estilosVerbalSequencial(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!estilosVerbalSequencial_cond_0()) return false;
                return true;
            case 1:
                if (!estilosVerbalSequencial_cond_1()) return false;
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
    private boolean checkCondForDeclaration_estilosVerbalSequencial(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            case 1:
                return true;
            default: return false;
        }
    }

    /**
     * Executes the action part of the rule estilosVerbalSequencial
     */
    private void estilosVerbalSequencial() {
	  System.out.println(" Ativou a regra para os estilos Verbal e Sequencial");
	  
	  OrdemComposicao ordemComposicao1 = new OrdemComposicao();
	  ordemComposicao1.getOrdem().add(new EtapaConteudo("Resumo"));
	  ordemComposicao1.getOrdem().add(new EtapaConteudo("Introdução"));
	  ordemComposicao1.getOrdem().add(new EtapaConteudo("Desenvolvimento"));
	  ordemComposicao1.getOrdem().add(new EtapaConteudo("Atividade"));
	  ordemComposicao1.getOrdem().add(new EtapaConteudo("Avaliação"));
	  
	  OrdemComposicao ordemComposicao2 = new OrdemComposicao();
	  ordemComposicao2.getOrdem().add(new EtapaConteudo("Introdução"));
	  ordemComposicao2.getOrdem().add(new EtapaConteudo("Desenvolvimento"));
	  ordemComposicao2.getOrdem().add(new EtapaConteudo("Atividade"));
	  ordemComposicao2.getOrdem().add(new EtapaConteudo("Resumo"));
	  ordemComposicao2.getOrdem().add(new EtapaConteudo("Avaliação"));
	  
	  ArrayList<RecursoEstilo> recursos = new ArrayList<RecursoEstilo>();
	  recursos.add(new Diagrama());
	  recursos.add(new Grafico());
	  recursos.add(new Figura());
	  recursos.add(new Narracao());
	  recursos.add(new Palestra());
	  recursos.add(new Slide());
	  recursos.add(new Esquema());
	  recursos.add(new AutoAvaliacao());
	  recursos.add(new Tabela());
	  recursos.add(new Simulacao());
	  recursos.add(new Animacao());
	  recursos.add(new Exercicio());
	  recursos.add(new Exemplo());
	  recursos.add(new Questionario());	  
	  recursos.add(new PaginaWeb());
	  recursos.add(new Demonstracao());	  	  
	  
	  estilo_estrutura_Estilo_1.setRecursos(recursos);
	  estilo_estrutura_Estilo_2.setRecursos(recursos);
	  

	  estilo_estrutura_Estilo_1.setFormaExploracao(new FormaExploracao("Linear"));
	  estilo_estrutura_Estilo_1.setOrdemDetalhamento(new OrdemDetalhamento("Específico para geral"));
	  estilo_estrutura_Estilo_1.setOrdemComposicao(ordemComposicao1);
	  modified(estilo_estrutura_Estilo_1);
	  
	  estilo_estrutura_Estilo_2.setFormaExploracao(new FormaExploracao("Linear"));
	  estilo_estrutura_Estilo_2.setOrdemDetalhamento(new OrdemDetalhamento("Específico para geral"));
	  estilo_estrutura_Estilo_2.setOrdemComposicao(ordemComposicao2);
	  modified(estilo_estrutura_Estilo_2);
	  	  
	  flush();
  
      }



  
    /**
     * Identifiers of rule estilosVerbalGlobal
     */
    private String[] identifiers_estilosVerbalGlobal = {
        "e1",
        "e2"
    };

    /**
     * Returns the identifiers declared in rule estilosVerbalGlobal
     *
     * @return the identifiers declared in rule estilosVerbalGlobal
     */
    private String[] getDeclaredIdentifiers_estilosVerbalGlobal() {
         return identifiers_estilosVerbalGlobal;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule estilosVerbalGlobal.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_estilosVerbalGlobal(int index) {
        switch (index) {
            case 0: return "estilo.estrutura.Estilo";
            case 1: return "estilo.estrutura.Estilo";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule estilosVerbalGlobal.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_estilosVerbalGlobal(int index) {
        switch (index) {
            case 0: return estilo.estrutura.Estilo.class;
            case 1: return estilo.estrutura.Estilo.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule estilosVerbalGlobal.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_estilosVerbalGlobal(int index, Object value) {
        switch (index) {
            case 0: this.estilo_estrutura_Estilo_1 = (estilo.estrutura.Estilo) value; break;
            case 1: this.estilo_estrutura_Estilo_2 = (estilo.estrutura.Estilo) value; break;
        }
    }

    /**
     * Returns an object declared in the rule estilosVerbalGlobal.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_estilosVerbalGlobal(int index) {
        switch (index) {
            case 0: return estilo_estrutura_Estilo_1;
            case 1: return estilo_estrutura_Estilo_2;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule estilosVerbalGlobal
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_estilosVerbalGlobal() {
        return new Object[] {
                            estilo_estrutura_Estilo_1,
                            estilo_estrutura_Estilo_2
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule estilosVerbalGlobal
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_estilosVerbalGlobal(Object[] objects) {
        estilo_estrutura_Estilo_1 = (estilo.estrutura.Estilo) objects[0];
        estilo_estrutura_Estilo_2 = (estilo.estrutura.Estilo) objects[1];
    }

    /**
     * Condition 0 of rule estilosVerbalGlobal.<p>
     * The original expression was:<br>
     * <code>e1.getEstiloNome().equalsIgnoreCase("Verbal")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean estilosVerbalGlobal_cond_0() {
        return (estilo_estrutura_Estilo_1.getEstiloNome().equalsIgnoreCase("Verbal"));
    }

    /**
     * Condition 1 of rule estilosVerbalGlobal.<p>
     * The original expression was:<br>
     * <code>e2.getEstiloNome().equalsIgnoreCase("Global")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean estilosVerbalGlobal_cond_1() {
        return (estilo_estrutura_Estilo_2.getEstiloNome().equalsIgnoreCase("Global"));
    }

    /**
     * Checks whether some conditions of rule estilosVerbalGlobal is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean estilosVerbalGlobal_cond(int index) {
        switch (index) {
            case 0: return estilosVerbalGlobal_cond_0();
            case 1: return estilosVerbalGlobal_cond_1();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule estilosVerbalGlobal that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_estilosVerbalGlobal(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!estilosVerbalGlobal_cond_0()) return false;
                return true;
            case 1:
                if (!estilosVerbalGlobal_cond_1()) return false;
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
    private boolean checkCondForDeclaration_estilosVerbalGlobal(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            case 1:
                return true;
            default: return false;
        }
    }

    /**
     * Executes the action part of the rule estilosVerbalGlobal
     */
    private void estilosVerbalGlobal() {
	  System.out.println(" Ativou a regra para os estilos Verbal e Global");
	  
	  OrdemComposicao ordemComposicao1 = new OrdemComposicao();
	  ordemComposicao1.getOrdem().add(new EtapaConteudo("Resumo"));
	  ordemComposicao1.getOrdem().add(new EtapaConteudo("Introdução"));
	  ordemComposicao1.getOrdem().add(new EtapaConteudo("Desenvolvimento"));
	  ordemComposicao1.getOrdem().add(new EtapaConteudo("Atividade"));
	  ordemComposicao1.getOrdem().add(new EtapaConteudo("Avaliação"));
	  
	  OrdemComposicao ordemComposicao2 = new OrdemComposicao();
	  ordemComposicao2.getOrdem().add(new EtapaConteudo("Resumo"));
	  ordemComposicao2.getOrdem().add(new EtapaConteudo("Introdução"));
	  ordemComposicao2.getOrdem().add(new EtapaConteudo("Desenvolvimento"));
	  ordemComposicao2.getOrdem().add(new EtapaConteudo("Atividade"));
	  ordemComposicao2.getOrdem().add(new EtapaConteudo("Avaliação"));
	  
	  ArrayList<RecursoEstilo> recursos = new ArrayList<RecursoEstilo>();
	  recursos.add(new Diagrama());
	  recursos.add(new Grafico());
	  recursos.add(new Figura());
	  recursos.add(new Narracao());
	  recursos.add(new Palestra());
	  recursos.add(new Slide());
	  recursos.add(new Experimento());
	  recursos.add(new AutoAvaliacao());
	  recursos.add(new Tabela());
	  recursos.add(new Esquema());
	  recursos.add(new Exercicio());
	  recursos.add(new Questionario());	  
	  recursos.add(new Exemplo());
	  recursos.add(new PaginaWeb());
	  recursos.add(new Demonstracao());	  	  
	  recursos.add(new Mapa());
	  
	  
	  estilo_estrutura_Estilo_1.setRecursos(recursos);
	  estilo_estrutura_Estilo_2.setRecursos(recursos);
	  

	  estilo_estrutura_Estilo_1.setFormaExploracao(new FormaExploracao("Linear"));
	  estilo_estrutura_Estilo_1.setOrdemDetalhamento(new OrdemDetalhamento("Específico para geral"));
	  estilo_estrutura_Estilo_1.setOrdemComposicao(ordemComposicao1);
	  modified(estilo_estrutura_Estilo_1);
	  
	  estilo_estrutura_Estilo_2.setFormaExploracao(new FormaExploracao("Rede"));
	  estilo_estrutura_Estilo_2.setOrdemDetalhamento(new OrdemDetalhamento("Geral para Específico"));
	  estilo_estrutura_Estilo_2.setOrdemComposicao(ordemComposicao2);
	  modified(estilo_estrutura_Estilo_2);
	  	  
	  flush();
  
      }



  

    /**
     * The names of the rules in this class file
     */
    private static final String[] File_ruleNames = {
        "estilosAtivoVerbal",
        "estilosAtivoVisual",
        "estilosAtivoSequencial",
        "estilosAtivoGlobal",
        "estilosAtivoSensorial",
        "estilosAtivoIntuitivo",
        "estilosReflexivoVerbal",
        "estilosReflexivoVisual",
        "estilosReflexivoSequencial",
        "estilosReflexivoGlobal",
        "estilosReflexivoSensorial",
        "estilosReflexivoIntuitivo",
        "estilosSensorialVerbal",
        "estilosSensorialVisual",
        "estilosSensorialSequencial",
        "estilosSensorialGlobal",
        "estilosIntuitivoVerbal",
        "estilosIntuitivoVisual",
        "estilosIntuitivoSequencial",
        "estilosIntuitivoGlobal",
        "estilosVisualSequencial",
        "estilosVisualGlobal",
        "estilosVerbalSequencial",
        "estilosVerbalGlobal"
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
        2,
        2,
        2,
        2,
        2
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
            case 0: return estilosAtivoVerbal_cond(condIndex);
            case 1: return estilosAtivoVisual_cond(condIndex);
            case 2: return estilosAtivoSequencial_cond(condIndex);
            case 3: return estilosAtivoGlobal_cond(condIndex);
            case 4: return estilosAtivoSensorial_cond(condIndex);
            case 5: return estilosAtivoIntuitivo_cond(condIndex);
            case 6: return estilosReflexivoVerbal_cond(condIndex);
            case 7: return estilosReflexivoVisual_cond(condIndex);
            case 8: return estilosReflexivoSequencial_cond(condIndex);
            case 9: return estilosReflexivoGlobal_cond(condIndex);
            case 10: return estilosReflexivoSensorial_cond(condIndex);
            case 11: return estilosReflexivoIntuitivo_cond(condIndex);
            case 12: return estilosSensorialVerbal_cond(condIndex);
            case 13: return estilosSensorialVisual_cond(condIndex);
            case 14: return estilosSensorialSequencial_cond(condIndex);
            case 15: return estilosSensorialGlobal_cond(condIndex);
            case 16: return estilosIntuitivoVerbal_cond(condIndex);
            case 17: return estilosIntuitivoVisual_cond(condIndex);
            case 18: return estilosIntuitivoSequencial_cond(condIndex);
            case 19: return estilosIntuitivoGlobal_cond(condIndex);
            case 20: return estilosVisualSequencial_cond(condIndex);
            case 21: return estilosVisualGlobal_cond(condIndex);
            case 22: return estilosVerbalSequencial_cond(condIndex);
            case 23: return estilosVerbalGlobal_cond(condIndex);
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
            case 0: return checkConditionsOnlyOf_estilosAtivoVerbal(declIndex);
            case 1: return checkConditionsOnlyOf_estilosAtivoVisual(declIndex);
            case 2: return checkConditionsOnlyOf_estilosAtivoSequencial(declIndex);
            case 3: return checkConditionsOnlyOf_estilosAtivoGlobal(declIndex);
            case 4: return checkConditionsOnlyOf_estilosAtivoSensorial(declIndex);
            case 5: return checkConditionsOnlyOf_estilosAtivoIntuitivo(declIndex);
            case 6: return checkConditionsOnlyOf_estilosReflexivoVerbal(declIndex);
            case 7: return checkConditionsOnlyOf_estilosReflexivoVisual(declIndex);
            case 8: return checkConditionsOnlyOf_estilosReflexivoSequencial(declIndex);
            case 9: return checkConditionsOnlyOf_estilosReflexivoGlobal(declIndex);
            case 10: return checkConditionsOnlyOf_estilosReflexivoSensorial(declIndex);
            case 11: return checkConditionsOnlyOf_estilosReflexivoIntuitivo(declIndex);
            case 12: return checkConditionsOnlyOf_estilosSensorialVerbal(declIndex);
            case 13: return checkConditionsOnlyOf_estilosSensorialVisual(declIndex);
            case 14: return checkConditionsOnlyOf_estilosSensorialSequencial(declIndex);
            case 15: return checkConditionsOnlyOf_estilosSensorialGlobal(declIndex);
            case 16: return checkConditionsOnlyOf_estilosIntuitivoVerbal(declIndex);
            case 17: return checkConditionsOnlyOf_estilosIntuitivoVisual(declIndex);
            case 18: return checkConditionsOnlyOf_estilosIntuitivoSequencial(declIndex);
            case 19: return checkConditionsOnlyOf_estilosIntuitivoGlobal(declIndex);
            case 20: return checkConditionsOnlyOf_estilosVisualSequencial(declIndex);
            case 21: return checkConditionsOnlyOf_estilosVisualGlobal(declIndex);
            case 22: return checkConditionsOnlyOf_estilosVerbalSequencial(declIndex);
            case 23: return checkConditionsOnlyOf_estilosVerbalGlobal(declIndex);
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
            case 0: return checkCondForDeclaration_estilosAtivoVerbal(declIndex);
            case 1: return checkCondForDeclaration_estilosAtivoVisual(declIndex);
            case 2: return checkCondForDeclaration_estilosAtivoSequencial(declIndex);
            case 3: return checkCondForDeclaration_estilosAtivoGlobal(declIndex);
            case 4: return checkCondForDeclaration_estilosAtivoSensorial(declIndex);
            case 5: return checkCondForDeclaration_estilosAtivoIntuitivo(declIndex);
            case 6: return checkCondForDeclaration_estilosReflexivoVerbal(declIndex);
            case 7: return checkCondForDeclaration_estilosReflexivoVisual(declIndex);
            case 8: return checkCondForDeclaration_estilosReflexivoSequencial(declIndex);
            case 9: return checkCondForDeclaration_estilosReflexivoGlobal(declIndex);
            case 10: return checkCondForDeclaration_estilosReflexivoSensorial(declIndex);
            case 11: return checkCondForDeclaration_estilosReflexivoIntuitivo(declIndex);
            case 12: return checkCondForDeclaration_estilosSensorialVerbal(declIndex);
            case 13: return checkCondForDeclaration_estilosSensorialVisual(declIndex);
            case 14: return checkCondForDeclaration_estilosSensorialSequencial(declIndex);
            case 15: return checkCondForDeclaration_estilosSensorialGlobal(declIndex);
            case 16: return checkCondForDeclaration_estilosIntuitivoVerbal(declIndex);
            case 17: return checkCondForDeclaration_estilosIntuitivoVisual(declIndex);
            case 18: return checkCondForDeclaration_estilosIntuitivoSequencial(declIndex);
            case 19: return checkCondForDeclaration_estilosIntuitivoGlobal(declIndex);
            case 20: return checkCondForDeclaration_estilosVisualSequencial(declIndex);
            case 21: return checkCondForDeclaration_estilosVisualGlobal(declIndex);
            case 22: return checkCondForDeclaration_estilosVerbalSequencial(declIndex);
            case 23: return checkCondForDeclaration_estilosVerbalGlobal(declIndex);
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
            case 0: return getDeclaredClassName_estilosAtivoVerbal(declIndex);
            case 1: return getDeclaredClassName_estilosAtivoVisual(declIndex);
            case 2: return getDeclaredClassName_estilosAtivoSequencial(declIndex);
            case 3: return getDeclaredClassName_estilosAtivoGlobal(declIndex);
            case 4: return getDeclaredClassName_estilosAtivoSensorial(declIndex);
            case 5: return getDeclaredClassName_estilosAtivoIntuitivo(declIndex);
            case 6: return getDeclaredClassName_estilosReflexivoVerbal(declIndex);
            case 7: return getDeclaredClassName_estilosReflexivoVisual(declIndex);
            case 8: return getDeclaredClassName_estilosReflexivoSequencial(declIndex);
            case 9: return getDeclaredClassName_estilosReflexivoGlobal(declIndex);
            case 10: return getDeclaredClassName_estilosReflexivoSensorial(declIndex);
            case 11: return getDeclaredClassName_estilosReflexivoIntuitivo(declIndex);
            case 12: return getDeclaredClassName_estilosSensorialVerbal(declIndex);
            case 13: return getDeclaredClassName_estilosSensorialVisual(declIndex);
            case 14: return getDeclaredClassName_estilosSensorialSequencial(declIndex);
            case 15: return getDeclaredClassName_estilosSensorialGlobal(declIndex);
            case 16: return getDeclaredClassName_estilosIntuitivoVerbal(declIndex);
            case 17: return getDeclaredClassName_estilosIntuitivoVisual(declIndex);
            case 18: return getDeclaredClassName_estilosIntuitivoSequencial(declIndex);
            case 19: return getDeclaredClassName_estilosIntuitivoGlobal(declIndex);
            case 20: return getDeclaredClassName_estilosVisualSequencial(declIndex);
            case 21: return getDeclaredClassName_estilosVisualGlobal(declIndex);
            case 22: return getDeclaredClassName_estilosVerbalSequencial(declIndex);
            case 23: return getDeclaredClassName_estilosVerbalGlobal(declIndex);
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
            case 0: return getDeclaredClass_estilosAtivoVerbal(declIndex);
            case 1: return getDeclaredClass_estilosAtivoVisual(declIndex);
            case 2: return getDeclaredClass_estilosAtivoSequencial(declIndex);
            case 3: return getDeclaredClass_estilosAtivoGlobal(declIndex);
            case 4: return getDeclaredClass_estilosAtivoSensorial(declIndex);
            case 5: return getDeclaredClass_estilosAtivoIntuitivo(declIndex);
            case 6: return getDeclaredClass_estilosReflexivoVerbal(declIndex);
            case 7: return getDeclaredClass_estilosReflexivoVisual(declIndex);
            case 8: return getDeclaredClass_estilosReflexivoSequencial(declIndex);
            case 9: return getDeclaredClass_estilosReflexivoGlobal(declIndex);
            case 10: return getDeclaredClass_estilosReflexivoSensorial(declIndex);
            case 11: return getDeclaredClass_estilosReflexivoIntuitivo(declIndex);
            case 12: return getDeclaredClass_estilosSensorialVerbal(declIndex);
            case 13: return getDeclaredClass_estilosSensorialVisual(declIndex);
            case 14: return getDeclaredClass_estilosSensorialSequencial(declIndex);
            case 15: return getDeclaredClass_estilosSensorialGlobal(declIndex);
            case 16: return getDeclaredClass_estilosIntuitivoVerbal(declIndex);
            case 17: return getDeclaredClass_estilosIntuitivoVisual(declIndex);
            case 18: return getDeclaredClass_estilosIntuitivoSequencial(declIndex);
            case 19: return getDeclaredClass_estilosIntuitivoGlobal(declIndex);
            case 20: return getDeclaredClass_estilosVisualSequencial(declIndex);
            case 21: return getDeclaredClass_estilosVisualGlobal(declIndex);
            case 22: return getDeclaredClass_estilosVerbalSequencial(declIndex);
            case 23: return getDeclaredClass_estilosVerbalGlobal(declIndex);
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
            case 0: estilosAtivoVerbal(); break;
            case 1: estilosAtivoVisual(); break;
            case 2: estilosAtivoSequencial(); break;
            case 3: estilosAtivoGlobal(); break;
            case 4: estilosAtivoSensorial(); break;
            case 5: estilosAtivoIntuitivo(); break;
            case 6: estilosReflexivoVerbal(); break;
            case 7: estilosReflexivoVisual(); break;
            case 8: estilosReflexivoSequencial(); break;
            case 9: estilosReflexivoGlobal(); break;
            case 10: estilosReflexivoSensorial(); break;
            case 11: estilosReflexivoIntuitivo(); break;
            case 12: estilosSensorialVerbal(); break;
            case 13: estilosSensorialVisual(); break;
            case 14: estilosSensorialSequencial(); break;
            case 15: estilosSensorialGlobal(); break;
            case 16: estilosIntuitivoVerbal(); break;
            case 17: estilosIntuitivoVisual(); break;
            case 18: estilosIntuitivoSequencial(); break;
            case 19: estilosIntuitivoGlobal(); break;
            case 20: estilosVisualSequencial(); break;
            case 21: estilosVisualGlobal(); break;
            case 22: estilosVerbalSequencial(); break;
            case 23: estilosVerbalGlobal(); break;
        }
    }

    /**
     * Returns the number of rules.
     *
     * @return the number of rules.
     */
    public int getNumberOfRules() {
        return 24;
    }

    /**
     * Returns the identifiers declared in a given rule.
     *
     * @param ruleIndex the index of the rule.
     * @return an array with the identifiers of the rule declarations.
     */
    public String[] getDeclaredIdentifiers(int ruleIndex) {
        switch (ruleIndex) {
            case 0: return getDeclaredIdentifiers_estilosAtivoVerbal();
            case 1: return getDeclaredIdentifiers_estilosAtivoVisual();
            case 2: return getDeclaredIdentifiers_estilosAtivoSequencial();
            case 3: return getDeclaredIdentifiers_estilosAtivoGlobal();
            case 4: return getDeclaredIdentifiers_estilosAtivoSensorial();
            case 5: return getDeclaredIdentifiers_estilosAtivoIntuitivo();
            case 6: return getDeclaredIdentifiers_estilosReflexivoVerbal();
            case 7: return getDeclaredIdentifiers_estilosReflexivoVisual();
            case 8: return getDeclaredIdentifiers_estilosReflexivoSequencial();
            case 9: return getDeclaredIdentifiers_estilosReflexivoGlobal();
            case 10: return getDeclaredIdentifiers_estilosReflexivoSensorial();
            case 11: return getDeclaredIdentifiers_estilosReflexivoIntuitivo();
            case 12: return getDeclaredIdentifiers_estilosSensorialVerbal();
            case 13: return getDeclaredIdentifiers_estilosSensorialVisual();
            case 14: return getDeclaredIdentifiers_estilosSensorialSequencial();
            case 15: return getDeclaredIdentifiers_estilosSensorialGlobal();
            case 16: return getDeclaredIdentifiers_estilosIntuitivoVerbal();
            case 17: return getDeclaredIdentifiers_estilosIntuitivoVisual();
            case 18: return getDeclaredIdentifiers_estilosIntuitivoSequencial();
            case 19: return getDeclaredIdentifiers_estilosIntuitivoGlobal();
            case 20: return getDeclaredIdentifiers_estilosVisualSequencial();
            case 21: return getDeclaredIdentifiers_estilosVisualGlobal();
            case 22: return getDeclaredIdentifiers_estilosVerbalSequencial();
            case 23: return getDeclaredIdentifiers_estilosVerbalGlobal();
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
            case 0: setObject_estilosAtivoVerbal(declIndex, value); break;
            case 1: setObject_estilosAtivoVisual(declIndex, value); break;
            case 2: setObject_estilosAtivoSequencial(declIndex, value); break;
            case 3: setObject_estilosAtivoGlobal(declIndex, value); break;
            case 4: setObject_estilosAtivoSensorial(declIndex, value); break;
            case 5: setObject_estilosAtivoIntuitivo(declIndex, value); break;
            case 6: setObject_estilosReflexivoVerbal(declIndex, value); break;
            case 7: setObject_estilosReflexivoVisual(declIndex, value); break;
            case 8: setObject_estilosReflexivoSequencial(declIndex, value); break;
            case 9: setObject_estilosReflexivoGlobal(declIndex, value); break;
            case 10: setObject_estilosReflexivoSensorial(declIndex, value); break;
            case 11: setObject_estilosReflexivoIntuitivo(declIndex, value); break;
            case 12: setObject_estilosSensorialVerbal(declIndex, value); break;
            case 13: setObject_estilosSensorialVisual(declIndex, value); break;
            case 14: setObject_estilosSensorialSequencial(declIndex, value); break;
            case 15: setObject_estilosSensorialGlobal(declIndex, value); break;
            case 16: setObject_estilosIntuitivoVerbal(declIndex, value); break;
            case 17: setObject_estilosIntuitivoVisual(declIndex, value); break;
            case 18: setObject_estilosIntuitivoSequencial(declIndex, value); break;
            case 19: setObject_estilosIntuitivoGlobal(declIndex, value); break;
            case 20: setObject_estilosVisualSequencial(declIndex, value); break;
            case 21: setObject_estilosVisualGlobal(declIndex, value); break;
            case 22: setObject_estilosVerbalSequencial(declIndex, value); break;
            case 23: setObject_estilosVerbalGlobal(declIndex, value); break;
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
            case 0: return getObject_estilosAtivoVerbal(declIndex);
            case 1: return getObject_estilosAtivoVisual(declIndex);
            case 2: return getObject_estilosAtivoSequencial(declIndex);
            case 3: return getObject_estilosAtivoGlobal(declIndex);
            case 4: return getObject_estilosAtivoSensorial(declIndex);
            case 5: return getObject_estilosAtivoIntuitivo(declIndex);
            case 6: return getObject_estilosReflexivoVerbal(declIndex);
            case 7: return getObject_estilosReflexivoVisual(declIndex);
            case 8: return getObject_estilosReflexivoSequencial(declIndex);
            case 9: return getObject_estilosReflexivoGlobal(declIndex);
            case 10: return getObject_estilosReflexivoSensorial(declIndex);
            case 11: return getObject_estilosReflexivoIntuitivo(declIndex);
            case 12: return getObject_estilosSensorialVerbal(declIndex);
            case 13: return getObject_estilosSensorialVisual(declIndex);
            case 14: return getObject_estilosSensorialSequencial(declIndex);
            case 15: return getObject_estilosSensorialGlobal(declIndex);
            case 16: return getObject_estilosIntuitivoVerbal(declIndex);
            case 17: return getObject_estilosIntuitivoVisual(declIndex);
            case 18: return getObject_estilosIntuitivoSequencial(declIndex);
            case 19: return getObject_estilosIntuitivoGlobal(declIndex);
            case 20: return getObject_estilosVisualSequencial(declIndex);
            case 21: return getObject_estilosVisualGlobal(declIndex);
            case 22: return getObject_estilosVerbalSequencial(declIndex);
            case 23: return getObject_estilosVerbalGlobal(declIndex);
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
            case 0: return getObjects_estilosAtivoVerbal();
            case 1: return getObjects_estilosAtivoVisual();
            case 2: return getObjects_estilosAtivoSequencial();
            case 3: return getObjects_estilosAtivoGlobal();
            case 4: return getObjects_estilosAtivoSensorial();
            case 5: return getObjects_estilosAtivoIntuitivo();
            case 6: return getObjects_estilosReflexivoVerbal();
            case 7: return getObjects_estilosReflexivoVisual();
            case 8: return getObjects_estilosReflexivoSequencial();
            case 9: return getObjects_estilosReflexivoGlobal();
            case 10: return getObjects_estilosReflexivoSensorial();
            case 11: return getObjects_estilosReflexivoIntuitivo();
            case 12: return getObjects_estilosSensorialVerbal();
            case 13: return getObjects_estilosSensorialVisual();
            case 14: return getObjects_estilosSensorialSequencial();
            case 15: return getObjects_estilosSensorialGlobal();
            case 16: return getObjects_estilosIntuitivoVerbal();
            case 17: return getObjects_estilosIntuitivoVisual();
            case 18: return getObjects_estilosIntuitivoSequencial();
            case 19: return getObjects_estilosIntuitivoGlobal();
            case 20: return getObjects_estilosVisualSequencial();
            case 21: return getObjects_estilosVisualGlobal();
            case 22: return getObjects_estilosVerbalSequencial();
            case 23: return getObjects_estilosVerbalGlobal();
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
            case 0: setObjects_estilosAtivoVerbal(objects); break;
            case 1: setObjects_estilosAtivoVisual(objects); break;
            case 2: setObjects_estilosAtivoSequencial(objects); break;
            case 3: setObjects_estilosAtivoGlobal(objects); break;
            case 4: setObjects_estilosAtivoSensorial(objects); break;
            case 5: setObjects_estilosAtivoIntuitivo(objects); break;
            case 6: setObjects_estilosReflexivoVerbal(objects); break;
            case 7: setObjects_estilosReflexivoVisual(objects); break;
            case 8: setObjects_estilosReflexivoSequencial(objects); break;
            case 9: setObjects_estilosReflexivoGlobal(objects); break;
            case 10: setObjects_estilosReflexivoSensorial(objects); break;
            case 11: setObjects_estilosReflexivoIntuitivo(objects); break;
            case 12: setObjects_estilosSensorialVerbal(objects); break;
            case 13: setObjects_estilosSensorialVisual(objects); break;
            case 14: setObjects_estilosSensorialSequencial(objects); break;
            case 15: setObjects_estilosSensorialGlobal(objects); break;
            case 16: setObjects_estilosIntuitivoVerbal(objects); break;
            case 17: setObjects_estilosIntuitivoVisual(objects); break;
            case 18: setObjects_estilosIntuitivoSequencial(objects); break;
            case 19: setObjects_estilosIntuitivoGlobal(objects); break;
            case 20: setObjects_estilosVisualSequencial(objects); break;
            case 21: setObjects_estilosVisualGlobal(objects); break;
            case 22: setObjects_estilosVerbalSequencial(objects); break;
            case 23: setObjects_estilosVerbalGlobal(objects); break;
        }
    }

    /*
     * The variables declared in the rules.
     */
    private estilo.estrutura.Estilo estilo_estrutura_Estilo_1;
    private estilo.estrutura.Estilo estilo_estrutura_Estilo_2;

    /**
     * Class constructor.
     *
     * @param knowledgeBase the knowledge base that contains this rule base.
     */
    public Jeops_RuleBase_EstilosForteParaDoisKB(jeops.AbstractKnowledgeBase knowledgeBase) {
        super(knowledgeBase);
    }

}
/**
 * Knowledge base created by JEOPS from file EstilosForteParaDoisKB.rules
 *
 * @version 06/08/2016
 */
public class EstilosForteParaDoisKB extends jeops.AbstractKnowledgeBase {

    /**
     * Creates a new knowledge base with the specified conflict set with the
     * desired conflict resolution policy.
     *
     * @param conflictSet a conflict set with the desired resolution policy
     */
    public EstilosForteParaDoisKB(jeops.conflict.ConflictSet conflictSet) {
        super(conflictSet);
    }

    /**
     * Creates a new knowledge base, using the default conflict resolution
     * policy.
     */
    public EstilosForteParaDoisKB() {
        this(new jeops.conflict.DefaultConflictSet());
    }

    /**
     * Factory method used to instantiate the rule base.
     */
    protected jeops.AbstractRuleBase createRuleBase() {
        return new Jeops_RuleBase_EstilosForteParaDoisKB(this);
    }

}
