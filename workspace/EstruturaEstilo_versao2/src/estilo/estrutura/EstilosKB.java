package estilo.estrutura;

import estilo.recursos.*;
import java.util.*;

  class Jeops_RuleBase_EstilosKB
extends jeops.AbstractRuleBase {
  
  
    /**
     * Identifiers of rule estiloAtivo
     */
    private String[] identifiers_estiloAtivo = {
        "e"
    };

    /**
     * Returns the identifiers declared in rule estiloAtivo
     *
     * @return the identifiers declared in rule estiloAtivo
     */
    private String[] getDeclaredIdentifiers_estiloAtivo() {
         return identifiers_estiloAtivo;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule estiloAtivo.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_estiloAtivo(int index) {
        switch (index) {
            case 0: return "estilo.estrutura.Estilo";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule estiloAtivo.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_estiloAtivo(int index) {
        switch (index) {
            case 0: return estilo.estrutura.Estilo.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule estiloAtivo.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_estiloAtivo(int index, Object value) {
        switch (index) {
            case 0: this.estilo_estrutura_Estilo_1 = (estilo.estrutura.Estilo) value; break;
        }
    }

    /**
     * Returns an object declared in the rule estiloAtivo.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_estiloAtivo(int index) {
        switch (index) {
            case 0: return estilo_estrutura_Estilo_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule estiloAtivo
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_estiloAtivo() {
        return new Object[] {
                            estilo_estrutura_Estilo_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule estiloAtivo
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_estiloAtivo(Object[] objects) {
        estilo_estrutura_Estilo_1 = (estilo.estrutura.Estilo) objects[0];
    }

    /**
     * Condition 0 of rule estiloAtivo.<p>
     * The original expression was:<br>
     * <code>e.getEstiloNome().equalsIgnoreCase("Ativo")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean estiloAtivo_cond_0() {
        return (estilo_estrutura_Estilo_1.getEstiloNome().equalsIgnoreCase("Ativo"));
    }

    /**
     * Checks whether some conditions of rule estiloAtivo is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean estiloAtivo_cond(int index) {
        switch (index) {
            case 0: return estiloAtivo_cond_0();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule estiloAtivo that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_estiloAtivo(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!estiloAtivo_cond_0()) return false;
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
    private boolean checkCondForDeclaration_estiloAtivo(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            default: return false;
        }
    }

    /**
     * Executes the action part of the rule estiloAtivo
     */
    private void estiloAtivo() {
	  System.out.println(" Ativou a regra para o estilo Ativo");
	  OrdemComposicao ordemComposicao = new OrdemComposicao();
	  ordemComposicao.getOrdem().add(new EtapaConteudo("Introdução"));
	  ordemComposicao.getOrdem().add(new EtapaConteudo("Desenvolvimento"));
	  ordemComposicao.getOrdem().add(new EtapaConteudo("Atividade"));
	  ordemComposicao.getOrdem().add(new EtapaConteudo("Avaliação"));
	  ordemComposicao.getOrdem().add(new EtapaConteudo("Resumo"));
	  ArrayList<RecursoEstilo> recursos = new ArrayList<RecursoEstilo>();
	  recursos.add(new Video());
	  recursos.add(new Diagrama());
	  recursos.add(new Figura());
	  recursos.add(new Grafico());
	  recursos.add(new AutoAvaliacao());
	  recursos.add(new Exercicio());
	  recursos.add(new Simulacao());
	  recursos.add(new Esquema());
	  recursos.add(new PaginaWeb());
	  recursos.add(new Mapa());
	  recursos.add(new Exemplo());
	  estilo_estrutura_Estilo_1.setRecursos(recursos);
	  estilo_estrutura_Estilo_1.setFormaExploracao(new FormaExploracao("Rede"));
	  estilo_estrutura_Estilo_1.setOrdemDetalhamento(new OrdemDetalhamento("Geral-para-Específico"));
	  estilo_estrutura_Estilo_1.setOrdemComposicao(ordemComposicao);
	  modified(estilo_estrutura_Estilo_1);
	  flush();
  
      }


  
  
    /**
     * Identifiers of rule estiloReflexivo
     */
    private String[] identifiers_estiloReflexivo = {
        "e"
    };

    /**
     * Returns the identifiers declared in rule estiloReflexivo
     *
     * @return the identifiers declared in rule estiloReflexivo
     */
    private String[] getDeclaredIdentifiers_estiloReflexivo() {
         return identifiers_estiloReflexivo;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule estiloReflexivo.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_estiloReflexivo(int index) {
        switch (index) {
            case 0: return "estilo.estrutura.Estilo";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule estiloReflexivo.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_estiloReflexivo(int index) {
        switch (index) {
            case 0: return estilo.estrutura.Estilo.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule estiloReflexivo.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_estiloReflexivo(int index, Object value) {
        switch (index) {
            case 0: this.estilo_estrutura_Estilo_1 = (estilo.estrutura.Estilo) value; break;
        }
    }

    /**
     * Returns an object declared in the rule estiloReflexivo.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_estiloReflexivo(int index) {
        switch (index) {
            case 0: return estilo_estrutura_Estilo_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule estiloReflexivo
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_estiloReflexivo() {
        return new Object[] {
                            estilo_estrutura_Estilo_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule estiloReflexivo
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_estiloReflexivo(Object[] objects) {
        estilo_estrutura_Estilo_1 = (estilo.estrutura.Estilo) objects[0];
    }

    /**
     * Condition 0 of rule estiloReflexivo.<p>
     * The original expression was:<br>
     * <code>e.getEstiloNome().equalsIgnoreCase("Reflexivo")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean estiloReflexivo_cond_0() {
        return (estilo_estrutura_Estilo_1.getEstiloNome().equalsIgnoreCase("Reflexivo"));
    }

    /**
     * Checks whether some conditions of rule estiloReflexivo is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean estiloReflexivo_cond(int index) {
        switch (index) {
            case 0: return estiloReflexivo_cond_0();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule estiloReflexivo that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_estiloReflexivo(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!estiloReflexivo_cond_0()) return false;
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
    private boolean checkCondForDeclaration_estiloReflexivo(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            default: return false;
        }
    }

    /**
     * Executes the action part of the rule estiloReflexivo
     */
    private void estiloReflexivo() {
      System.out.println(" Ativou a regra para o estilo Reflexivo");
      OrdemComposicao ordemComposicao = new OrdemComposicao();
      ordemComposicao.getOrdem().add(new EtapaConteudo("Introdução"));
      ordemComposicao.getOrdem().add(new EtapaConteudo("Desenvolvimento"));
      ordemComposicao.getOrdem().add(new EtapaConteudo("Resumo"));
      ordemComposicao.getOrdem().add(new EtapaConteudo("Atividade"));
      ordemComposicao.getOrdem().add(new EtapaConteudo("Avaliação"));
      ArrayList<RecursoEstilo> recursos = new ArrayList<RecursoEstilo>();
      recursos.add(new Palestra());
      recursos.add(new Diagrama());
      recursos.add(new Slide());
      recursos.add(new Grafico());
      recursos.add(new AutoAvaliacao());
	  recursos.add(new Exercicio());
	  recursos.add(new Simulacao());
	  recursos.add(new Esquema());
	  recursos.add(new PaginaWeb());
	  recursos.add(new Animacao());
	  recursos.add(new Exemplo());
	  recursos.add(new Tabela());
	  recursos.add(new Demonstracao());
	  estilo_estrutura_Estilo_1.setRecursos(recursos);
	  estilo_estrutura_Estilo_1.setFormaExploracao(new FormaExploracao("Linear"));
	  estilo_estrutura_Estilo_1.setOrdemDetalhamento(new OrdemDetalhamento("Específico-para-geral"));
	  estilo_estrutura_Estilo_1.setOrdemComposicao(ordemComposicao);
	  modified(estilo_estrutura_Estilo_1);
	  flush();
  
      }


  
  
    /**
     * Identifiers of rule estiloSensorial
     */
    private String[] identifiers_estiloSensorial = {
        "e"
    };

    /**
     * Returns the identifiers declared in rule estiloSensorial
     *
     * @return the identifiers declared in rule estiloSensorial
     */
    private String[] getDeclaredIdentifiers_estiloSensorial() {
         return identifiers_estiloSensorial;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule estiloSensorial.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_estiloSensorial(int index) {
        switch (index) {
            case 0: return "estilo.estrutura.Estilo";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule estiloSensorial.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_estiloSensorial(int index) {
        switch (index) {
            case 0: return estilo.estrutura.Estilo.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule estiloSensorial.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_estiloSensorial(int index, Object value) {
        switch (index) {
            case 0: this.estilo_estrutura_Estilo_1 = (estilo.estrutura.Estilo) value; break;
        }
    }

    /**
     * Returns an object declared in the rule estiloSensorial.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_estiloSensorial(int index) {
        switch (index) {
            case 0: return estilo_estrutura_Estilo_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule estiloSensorial
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_estiloSensorial() {
        return new Object[] {
                            estilo_estrutura_Estilo_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule estiloSensorial
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_estiloSensorial(Object[] objects) {
        estilo_estrutura_Estilo_1 = (estilo.estrutura.Estilo) objects[0];
    }

    /**
     * Condition 0 of rule estiloSensorial.<p>
     * The original expression was:<br>
     * <code>e.getEstiloNome().equalsIgnoreCase("Sensorial")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean estiloSensorial_cond_0() {
        return (estilo_estrutura_Estilo_1.getEstiloNome().equalsIgnoreCase("Sensorial"));
    }

    /**
     * Checks whether some conditions of rule estiloSensorial is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean estiloSensorial_cond(int index) {
        switch (index) {
            case 0: return estiloSensorial_cond_0();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule estiloSensorial that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_estiloSensorial(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!estiloSensorial_cond_0()) return false;
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
    private boolean checkCondForDeclaration_estiloSensorial(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            default: return false;
        }
    }

    /**
     * Executes the action part of the rule estiloSensorial
     */
    private void estiloSensorial() {
  	  System.out.println(" Ativou a regra para o estilo Sensorial");
      OrdemComposicao ordemComposicao = new OrdemComposicao();
      ordemComposicao.getOrdem().add(new EtapaConteudo("Resumo"));
      ordemComposicao.getOrdem().add(new EtapaConteudo("Introducao"));
      ordemComposicao.getOrdem().add(new EtapaConteudo("Desenvolvimento"));
      ordemComposicao.getOrdem().add(new EtapaConteudo("Atividade"));
      ordemComposicao.getOrdem().add(new EtapaConteudo("Avaliação"));
      ArrayList<RecursoEstilo> recursos = new ArrayList<RecursoEstilo>();
      recursos.add(new Narracao());
      recursos.add(new Video());
      recursos.add(new Slide());
      recursos.add(new Grafico());
      recursos.add(new AutoAvaliacao());
	  recursos.add(new Exercicio());
	  recursos.add(new Mapa());
	  recursos.add(new Questionario());
	  recursos.add(new PaginaWeb());
	  recursos.add(new Experimento());
	  recursos.add(new Exemplo());
	  recursos.add(new Tabela());
	  recursos.add(new Demonstracao());
	  estilo_estrutura_Estilo_1.setRecursos(recursos);
	  estilo_estrutura_Estilo_1.setFormaExploracao(new FormaExploracao("Rede"));
	  estilo_estrutura_Estilo_1.setOrdemDetalhamento(new OrdemDetalhamento("Específico-para-geral"));
	  estilo_estrutura_Estilo_1.setOrdemComposicao(ordemComposicao);
	  modified(estilo_estrutura_Estilo_1);
	  flush();
      }


  
  
    /**
     * Identifiers of rule estiloIntuitivo
     */
    private String[] identifiers_estiloIntuitivo = {
        "e"
    };

    /**
     * Returns the identifiers declared in rule estiloIntuitivo
     *
     * @return the identifiers declared in rule estiloIntuitivo
     */
    private String[] getDeclaredIdentifiers_estiloIntuitivo() {
         return identifiers_estiloIntuitivo;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule estiloIntuitivo.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_estiloIntuitivo(int index) {
        switch (index) {
            case 0: return "estilo.estrutura.Estilo";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule estiloIntuitivo.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_estiloIntuitivo(int index) {
        switch (index) {
            case 0: return estilo.estrutura.Estilo.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule estiloIntuitivo.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_estiloIntuitivo(int index, Object value) {
        switch (index) {
            case 0: this.estilo_estrutura_Estilo_1 = (estilo.estrutura.Estilo) value; break;
        }
    }

    /**
     * Returns an object declared in the rule estiloIntuitivo.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_estiloIntuitivo(int index) {
        switch (index) {
            case 0: return estilo_estrutura_Estilo_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule estiloIntuitivo
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_estiloIntuitivo() {
        return new Object[] {
                            estilo_estrutura_Estilo_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule estiloIntuitivo
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_estiloIntuitivo(Object[] objects) {
        estilo_estrutura_Estilo_1 = (estilo.estrutura.Estilo) objects[0];
    }

    /**
     * Condition 0 of rule estiloIntuitivo.<p>
     * The original expression was:<br>
     * <code>e.getEstiloNome().equalsIgnoreCase("Intuitivo")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean estiloIntuitivo_cond_0() {
        return (estilo_estrutura_Estilo_1.getEstiloNome().equalsIgnoreCase("Intuitivo"));
    }

    /**
     * Checks whether some conditions of rule estiloIntuitivo is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean estiloIntuitivo_cond(int index) {
        switch (index) {
            case 0: return estiloIntuitivo_cond_0();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule estiloIntuitivo that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_estiloIntuitivo(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!estiloIntuitivo_cond_0()) return false;
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
    private boolean checkCondForDeclaration_estiloIntuitivo(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            default: return false;
        }
    }

    /**
     * Executes the action part of the rule estiloIntuitivo
     */
    private void estiloIntuitivo() {
  	  System.out.println(" Ativou a regra para o estilo Intuitivo");
	  OrdemComposicao ordemComposicao = new OrdemComposicao();
	  ordemComposicao.getOrdem().add(new EtapaConteudo("Introdução"));
	  ordemComposicao.getOrdem().add(new EtapaConteudo("Desenvolvimento"));
	  ordemComposicao.getOrdem().add(new EtapaConteudo("Resumo"));
	  ordemComposicao.getOrdem().add(new EtapaConteudo("Atividade"));
	  ordemComposicao.getOrdem().add(new EtapaConteudo("Avaliação"));
	  ArrayList<RecursoEstilo> recursos = new ArrayList<RecursoEstilo>();
	  recursos.add(new Narracao());
	  recursos.add(new Palestra());
	  recursos.add(new Figura());
	  recursos.add(new Grafico());
	  recursos.add(new AutoAvaliacao());
	  recursos.add(new Exercicio());
	  recursos.add(new Simulacao());
	  recursos.add(new Slide());
	  recursos.add(new Questionario());
	  recursos.add(new Animacao());
	  recursos.add(new Exemplo());
	  recursos.add(new Foto());
	  estilo_estrutura_Estilo_1.setRecursos(recursos);
	  estilo_estrutura_Estilo_1.setFormaExploracao(new FormaExploracao("Linear"));
	  estilo_estrutura_Estilo_1.setOrdemDetalhamento(new OrdemDetalhamento("Geral-para-Específico"));
	  estilo_estrutura_Estilo_1.setOrdemComposicao(ordemComposicao);
	  modified(estilo_estrutura_Estilo_1);
	  flush();
      }


  
  
    /**
     * Identifiers of rule estiloSequencial
     */
    private String[] identifiers_estiloSequencial = {
        "e"
    };

    /**
     * Returns the identifiers declared in rule estiloSequencial
     *
     * @return the identifiers declared in rule estiloSequencial
     */
    private String[] getDeclaredIdentifiers_estiloSequencial() {
         return identifiers_estiloSequencial;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule estiloSequencial.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_estiloSequencial(int index) {
        switch (index) {
            case 0: return "estilo.estrutura.Estilo";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule estiloSequencial.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_estiloSequencial(int index) {
        switch (index) {
            case 0: return estilo.estrutura.Estilo.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule estiloSequencial.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_estiloSequencial(int index, Object value) {
        switch (index) {
            case 0: this.estilo_estrutura_Estilo_1 = (estilo.estrutura.Estilo) value; break;
        }
    }

    /**
     * Returns an object declared in the rule estiloSequencial.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_estiloSequencial(int index) {
        switch (index) {
            case 0: return estilo_estrutura_Estilo_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule estiloSequencial
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_estiloSequencial() {
        return new Object[] {
                            estilo_estrutura_Estilo_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule estiloSequencial
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_estiloSequencial(Object[] objects) {
        estilo_estrutura_Estilo_1 = (estilo.estrutura.Estilo) objects[0];
    }

    /**
     * Condition 0 of rule estiloSequencial.<p>
     * The original expression was:<br>
     * <code>e.getEstiloNome().equalsIgnoreCase("Sequencial")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean estiloSequencial_cond_0() {
        return (estilo_estrutura_Estilo_1.getEstiloNome().equalsIgnoreCase("Sequencial"));
    }

    /**
     * Checks whether some conditions of rule estiloSequencial is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean estiloSequencial_cond(int index) {
        switch (index) {
            case 0: return estiloSequencial_cond_0();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule estiloSequencial that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_estiloSequencial(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!estiloSequencial_cond_0()) return false;
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
    private boolean checkCondForDeclaration_estiloSequencial(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            default: return false;
        }
    }

    /**
     * Executes the action part of the rule estiloSequencial
     */
    private void estiloSequencial() {
  	  System.out.println(" Ativou a regra para o estilo Sequencial");
	  OrdemComposicao ordemComposicao = new OrdemComposicao();
	  ordemComposicao.getOrdem().add(new EtapaConteudo("Introdução"));
	  ordemComposicao.getOrdem().add(new EtapaConteudo("Desenvolvimento"));
	  ordemComposicao.getOrdem().add(new EtapaConteudo("Atividade"));
	  ordemComposicao.getOrdem().add(new EtapaConteudo("Avaliação"));
	  ordemComposicao.getOrdem().add(new EtapaConteudo("Resumo"));
	  ArrayList<RecursoEstilo> recursos = new ArrayList<RecursoEstilo>();
	  recursos.add(new Narracao());
	  recursos.add(new Palestra());
	  recursos.add(new Figura());
	  recursos.add(new Grafico());
	  recursos.add(new AutoAvaliacao());
	  recursos.add(new Diagrama());
	  recursos.add(new Simulacao());
	  recursos.add(new Slide());
	  recursos.add(new Questionario());
	  recursos.add(new Animacao());
	  recursos.add(new Exemplo());
	  recursos.add(new Exercicio());
	  recursos.add(new Esquema());
	  recursos.add(new Demonstracao());
	  recursos.add(new PaginaWeb());
	  estilo_estrutura_Estilo_1.setRecursos(recursos);
	  estilo_estrutura_Estilo_1.setFormaExploracao(new FormaExploracao("Linear"));
	  estilo_estrutura_Estilo_1.setOrdemDetalhamento(new OrdemDetalhamento("Específico-para-geral"));
	  estilo_estrutura_Estilo_1.setOrdemComposicao(ordemComposicao);
	  modified(estilo_estrutura_Estilo_1);
	  flush();
      }


  
  
    /**
     * Identifiers of rule estiloGlobal
     */
    private String[] identifiers_estiloGlobal = {
        "e"
    };

    /**
     * Returns the identifiers declared in rule estiloGlobal
     *
     * @return the identifiers declared in rule estiloGlobal
     */
    private String[] getDeclaredIdentifiers_estiloGlobal() {
         return identifiers_estiloGlobal;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule estiloGlobal.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_estiloGlobal(int index) {
        switch (index) {
            case 0: return "estilo.estrutura.Estilo";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule estiloGlobal.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_estiloGlobal(int index) {
        switch (index) {
            case 0: return estilo.estrutura.Estilo.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule estiloGlobal.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_estiloGlobal(int index, Object value) {
        switch (index) {
            case 0: this.estilo_estrutura_Estilo_1 = (estilo.estrutura.Estilo) value; break;
        }
    }

    /**
     * Returns an object declared in the rule estiloGlobal.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_estiloGlobal(int index) {
        switch (index) {
            case 0: return estilo_estrutura_Estilo_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule estiloGlobal
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_estiloGlobal() {
        return new Object[] {
                            estilo_estrutura_Estilo_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule estiloGlobal
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_estiloGlobal(Object[] objects) {
        estilo_estrutura_Estilo_1 = (estilo.estrutura.Estilo) objects[0];
    }

    /**
     * Condition 0 of rule estiloGlobal.<p>
     * The original expression was:<br>
     * <code>e.getEstiloNome().equalsIgnoreCase("Global")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean estiloGlobal_cond_0() {
        return (estilo_estrutura_Estilo_1.getEstiloNome().equalsIgnoreCase("Global"));
    }

    /**
     * Checks whether some conditions of rule estiloGlobal is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean estiloGlobal_cond(int index) {
        switch (index) {
            case 0: return estiloGlobal_cond_0();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule estiloGlobal that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_estiloGlobal(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!estiloGlobal_cond_0()) return false;
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
    private boolean checkCondForDeclaration_estiloGlobal(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            default: return false;
        }
    }

    /**
     * Executes the action part of the rule estiloGlobal
     */
    private void estiloGlobal() {
      System.out.println(" Ativou a regra para o estilo Global");
	  OrdemComposicao ordemComposicao = new OrdemComposicao();
	  ordemComposicao.getOrdem().add(new EtapaConteudo("Resumo"));
	  ordemComposicao.getOrdem().add(new EtapaConteudo("Introdução"));
	  ordemComposicao.getOrdem().add(new EtapaConteudo("Desenvolvimento"));
	  ordemComposicao.getOrdem().add(new EtapaConteudo("Atividade"));
	  ordemComposicao.getOrdem().add(new EtapaConteudo("Avaliação"));
	  ArrayList<RecursoEstilo> recursos = new ArrayList<RecursoEstilo>();
	  recursos.add(new Diagrama());
	  recursos.add(new Experimento());
	  recursos.add(new Figura());
	  recursos.add(new Grafico());
	  recursos.add(new AutoAvaliacao());
	  recursos.add(new Exercicio());
	  recursos.add(new Esquema());
	  recursos.add(new Slide());
	  recursos.add(new PaginaWeb());
	  recursos.add(new Mapa());
	  recursos.add(new Exemplo());
	  estilo_estrutura_Estilo_1.setRecursos(recursos);
	  estilo_estrutura_Estilo_1.setFormaExploracao(new FormaExploracao("Rede"));
	  estilo_estrutura_Estilo_1.setOrdemDetalhamento(new OrdemDetalhamento("Geral-para-Específico"));
	  estilo_estrutura_Estilo_1.setOrdemComposicao(ordemComposicao);
	  modified(estilo_estrutura_Estilo_1);
	  flush();
      }


  
  
    /**
     * Identifiers of rule estiloVerbal
     */
    private String[] identifiers_estiloVerbal = {
        "e"
    };

    /**
     * Returns the identifiers declared in rule estiloVerbal
     *
     * @return the identifiers declared in rule estiloVerbal
     */
    private String[] getDeclaredIdentifiers_estiloVerbal() {
         return identifiers_estiloVerbal;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule estiloVerbal.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_estiloVerbal(int index) {
        switch (index) {
            case 0: return "estilo.estrutura.Estilo";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule estiloVerbal.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_estiloVerbal(int index) {
        switch (index) {
            case 0: return estilo.estrutura.Estilo.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule estiloVerbal.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_estiloVerbal(int index, Object value) {
        switch (index) {
            case 0: this.estilo_estrutura_Estilo_1 = (estilo.estrutura.Estilo) value; break;
        }
    }

    /**
     * Returns an object declared in the rule estiloVerbal.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_estiloVerbal(int index) {
        switch (index) {
            case 0: return estilo_estrutura_Estilo_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule estiloVerbal
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_estiloVerbal() {
        return new Object[] {
                            estilo_estrutura_Estilo_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule estiloVerbal
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_estiloVerbal(Object[] objects) {
        estilo_estrutura_Estilo_1 = (estilo.estrutura.Estilo) objects[0];
    }

    /**
     * Condition 0 of rule estiloVerbal.<p>
     * The original expression was:<br>
     * <code>e.getEstiloNome().equalsIgnoreCase("Verbal")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean estiloVerbal_cond_0() {
        return (estilo_estrutura_Estilo_1.getEstiloNome().equalsIgnoreCase("Verbal"));
    }

    /**
     * Checks whether some conditions of rule estiloVerbal is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean estiloVerbal_cond(int index) {
        switch (index) {
            case 0: return estiloVerbal_cond_0();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule estiloVerbal that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_estiloVerbal(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!estiloVerbal_cond_0()) return false;
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
    private boolean checkCondForDeclaration_estiloVerbal(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            default: return false;
        }
    }

    /**
     * Executes the action part of the rule estiloVerbal
     */
    private void estiloVerbal() {
      System.out.println(" Ativou a regra para o estilo Verbal");
	  OrdemComposicao ordemComposicao = new OrdemComposicao();
	  ordemComposicao.getOrdem().add(new EtapaConteudo("Resumo"));
	  ordemComposicao.getOrdem().add(new EtapaConteudo("Introdução"));
	  ordemComposicao.getOrdem().add(new EtapaConteudo("Desenvolvimento"));
	  ordemComposicao.getOrdem().add(new EtapaConteudo("Atividade"));
	  ordemComposicao.getOrdem().add(new EtapaConteudo("Avaliação"));
	  ArrayList<RecursoEstilo> recursos = new ArrayList<RecursoEstilo>();
	  recursos.add(new Narracao());
	  recursos.add(new Palestra());
	  recursos.add(new Tabela());
	  recursos.add(new AutoAvaliacao());
	  recursos.add(new Diagrama());
	  recursos.add(new Slide());
	  recursos.add(new Questionario());
	  recursos.add(new Exemplo());
	  recursos.add(new Exercicio());
	  recursos.add(new Demonstracao());
	  recursos.add(new PaginaWeb());
	  estilo_estrutura_Estilo_1.setRecursos(recursos);
	  estilo_estrutura_Estilo_1.setFormaExploracao(new FormaExploracao("Linear"));
	  estilo_estrutura_Estilo_1.setOrdemDetalhamento(new OrdemDetalhamento("Específico-para-geral"));
	  estilo_estrutura_Estilo_1.setOrdemComposicao(ordemComposicao);
	  modified(estilo_estrutura_Estilo_1);
	  flush();
      }


  
  
    /**
     * Identifiers of rule estiloVisual
     */
    private String[] identifiers_estiloVisual = {
        "e"
    };

    /**
     * Returns the identifiers declared in rule estiloVisual
     *
     * @return the identifiers declared in rule estiloVisual
     */
    private String[] getDeclaredIdentifiers_estiloVisual() {
         return identifiers_estiloVisual;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule estiloVisual.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_estiloVisual(int index) {
        switch (index) {
            case 0: return "estilo.estrutura.Estilo";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule estiloVisual.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_estiloVisual(int index) {
        switch (index) {
            case 0: return estilo.estrutura.Estilo.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule estiloVisual.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_estiloVisual(int index, Object value) {
        switch (index) {
            case 0: this.estilo_estrutura_Estilo_1 = (estilo.estrutura.Estilo) value; break;
        }
    }

    /**
     * Returns an object declared in the rule estiloVisual.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_estiloVisual(int index) {
        switch (index) {
            case 0: return estilo_estrutura_Estilo_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule estiloVisual
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_estiloVisual() {
        return new Object[] {
                            estilo_estrutura_Estilo_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule estiloVisual
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_estiloVisual(Object[] objects) {
        estilo_estrutura_Estilo_1 = (estilo.estrutura.Estilo) objects[0];
    }

    /**
     * Condition 0 of rule estiloVisual.<p>
     * The original expression was:<br>
     * <code>e.getEstiloNome().equalsIgnoreCase("Visual")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean estiloVisual_cond_0() {
        return (estilo_estrutura_Estilo_1.getEstiloNome().equalsIgnoreCase("Visual"));
    }

    /**
     * Checks whether some conditions of rule estiloVisual is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean estiloVisual_cond(int index) {
        switch (index) {
            case 0: return estiloVisual_cond_0();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule estiloVisual that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_estiloVisual(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!estiloVisual_cond_0()) return false;
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
    private boolean checkCondForDeclaration_estiloVisual(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            default: return false;
        }
    }

    /**
     * Executes the action part of the rule estiloVisual
     */
    private void estiloVisual() {
      System.out.println(" Ativou a regra para o estilo Visual");
	  OrdemComposicao ordemComposicao = new OrdemComposicao();
	  ordemComposicao.getOrdem().add(new EtapaConteudo("Resumo"));
	  ordemComposicao.getOrdem().add(new EtapaConteudo("Introdução"));
	  ordemComposicao.getOrdem().add(new EtapaConteudo("Desenvolvimento"));
	  ordemComposicao.getOrdem().add(new EtapaConteudo("Atividade"));
	  ordemComposicao.getOrdem().add(new EtapaConteudo("Avaliação"));
	  ArrayList<RecursoEstilo> recursos = new ArrayList<RecursoEstilo>();
	  recursos.add(new Diagrama());
	  recursos.add(new Experimento());
	  recursos.add(new Figura());
	  recursos.add(new Grafico());
	  recursos.add(new AutoAvaliacao());
	  recursos.add(new Exercicio());
	  recursos.add(new Tabela());
	  recursos.add(new Slide());
	  recursos.add(new PaginaWeb());
	  recursos.add(new Mapa());
	  recursos.add(new Exemplo());
	  recursos.add(new Simulacao());
	  recursos.add(new Animacao());
	  recursos.add(new Foto());
	  recursos.add(new Demonstracao());
	  estilo_estrutura_Estilo_1.setRecursos(recursos);
	  estilo_estrutura_Estilo_1.setFormaExploracao(new FormaExploracao("Rede"));
	  estilo_estrutura_Estilo_1.setOrdemDetalhamento(new OrdemDetalhamento("Geral-para-Específico"));
	  estilo_estrutura_Estilo_1.setOrdemComposicao(ordemComposicao);
	  modified(estilo_estrutura_Estilo_1);
	  flush();
      }


  

    /**
     * The names of the rules in this class file
     */
    private static final String[] File_ruleNames = {
        "estiloAtivo",
        "estiloReflexivo",
        "estiloSensorial",
        "estiloIntuitivo",
        "estiloSequencial",
        "estiloGlobal",
        "estiloVerbal",
        "estiloVisual"
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
            case 0: return estiloAtivo_cond(condIndex);
            case 1: return estiloReflexivo_cond(condIndex);
            case 2: return estiloSensorial_cond(condIndex);
            case 3: return estiloIntuitivo_cond(condIndex);
            case 4: return estiloSequencial_cond(condIndex);
            case 5: return estiloGlobal_cond(condIndex);
            case 6: return estiloVerbal_cond(condIndex);
            case 7: return estiloVisual_cond(condIndex);
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
            case 0: return checkConditionsOnlyOf_estiloAtivo(declIndex);
            case 1: return checkConditionsOnlyOf_estiloReflexivo(declIndex);
            case 2: return checkConditionsOnlyOf_estiloSensorial(declIndex);
            case 3: return checkConditionsOnlyOf_estiloIntuitivo(declIndex);
            case 4: return checkConditionsOnlyOf_estiloSequencial(declIndex);
            case 5: return checkConditionsOnlyOf_estiloGlobal(declIndex);
            case 6: return checkConditionsOnlyOf_estiloVerbal(declIndex);
            case 7: return checkConditionsOnlyOf_estiloVisual(declIndex);
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
            case 0: return checkCondForDeclaration_estiloAtivo(declIndex);
            case 1: return checkCondForDeclaration_estiloReflexivo(declIndex);
            case 2: return checkCondForDeclaration_estiloSensorial(declIndex);
            case 3: return checkCondForDeclaration_estiloIntuitivo(declIndex);
            case 4: return checkCondForDeclaration_estiloSequencial(declIndex);
            case 5: return checkCondForDeclaration_estiloGlobal(declIndex);
            case 6: return checkCondForDeclaration_estiloVerbal(declIndex);
            case 7: return checkCondForDeclaration_estiloVisual(declIndex);
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
            case 0: return getDeclaredClassName_estiloAtivo(declIndex);
            case 1: return getDeclaredClassName_estiloReflexivo(declIndex);
            case 2: return getDeclaredClassName_estiloSensorial(declIndex);
            case 3: return getDeclaredClassName_estiloIntuitivo(declIndex);
            case 4: return getDeclaredClassName_estiloSequencial(declIndex);
            case 5: return getDeclaredClassName_estiloGlobal(declIndex);
            case 6: return getDeclaredClassName_estiloVerbal(declIndex);
            case 7: return getDeclaredClassName_estiloVisual(declIndex);
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
            case 0: return getDeclaredClass_estiloAtivo(declIndex);
            case 1: return getDeclaredClass_estiloReflexivo(declIndex);
            case 2: return getDeclaredClass_estiloSensorial(declIndex);
            case 3: return getDeclaredClass_estiloIntuitivo(declIndex);
            case 4: return getDeclaredClass_estiloSequencial(declIndex);
            case 5: return getDeclaredClass_estiloGlobal(declIndex);
            case 6: return getDeclaredClass_estiloVerbal(declIndex);
            case 7: return getDeclaredClass_estiloVisual(declIndex);
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
            case 0: estiloAtivo(); break;
            case 1: estiloReflexivo(); break;
            case 2: estiloSensorial(); break;
            case 3: estiloIntuitivo(); break;
            case 4: estiloSequencial(); break;
            case 5: estiloGlobal(); break;
            case 6: estiloVerbal(); break;
            case 7: estiloVisual(); break;
        }
    }

    /**
     * Returns the number of rules.
     *
     * @return the number of rules.
     */
    public int getNumberOfRules() {
        return 8;
    }

    /**
     * Returns the identifiers declared in a given rule.
     *
     * @param ruleIndex the index of the rule.
     * @return an array with the identifiers of the rule declarations.
     */
    public String[] getDeclaredIdentifiers(int ruleIndex) {
        switch (ruleIndex) {
            case 0: return getDeclaredIdentifiers_estiloAtivo();
            case 1: return getDeclaredIdentifiers_estiloReflexivo();
            case 2: return getDeclaredIdentifiers_estiloSensorial();
            case 3: return getDeclaredIdentifiers_estiloIntuitivo();
            case 4: return getDeclaredIdentifiers_estiloSequencial();
            case 5: return getDeclaredIdentifiers_estiloGlobal();
            case 6: return getDeclaredIdentifiers_estiloVerbal();
            case 7: return getDeclaredIdentifiers_estiloVisual();
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
            case 0: setObject_estiloAtivo(declIndex, value); break;
            case 1: setObject_estiloReflexivo(declIndex, value); break;
            case 2: setObject_estiloSensorial(declIndex, value); break;
            case 3: setObject_estiloIntuitivo(declIndex, value); break;
            case 4: setObject_estiloSequencial(declIndex, value); break;
            case 5: setObject_estiloGlobal(declIndex, value); break;
            case 6: setObject_estiloVerbal(declIndex, value); break;
            case 7: setObject_estiloVisual(declIndex, value); break;
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
            case 0: return getObject_estiloAtivo(declIndex);
            case 1: return getObject_estiloReflexivo(declIndex);
            case 2: return getObject_estiloSensorial(declIndex);
            case 3: return getObject_estiloIntuitivo(declIndex);
            case 4: return getObject_estiloSequencial(declIndex);
            case 5: return getObject_estiloGlobal(declIndex);
            case 6: return getObject_estiloVerbal(declIndex);
            case 7: return getObject_estiloVisual(declIndex);
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
            case 0: return getObjects_estiloAtivo();
            case 1: return getObjects_estiloReflexivo();
            case 2: return getObjects_estiloSensorial();
            case 3: return getObjects_estiloIntuitivo();
            case 4: return getObjects_estiloSequencial();
            case 5: return getObjects_estiloGlobal();
            case 6: return getObjects_estiloVerbal();
            case 7: return getObjects_estiloVisual();
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
            case 0: setObjects_estiloAtivo(objects); break;
            case 1: setObjects_estiloReflexivo(objects); break;
            case 2: setObjects_estiloSensorial(objects); break;
            case 3: setObjects_estiloIntuitivo(objects); break;
            case 4: setObjects_estiloSequencial(objects); break;
            case 5: setObjects_estiloGlobal(objects); break;
            case 6: setObjects_estiloVerbal(objects); break;
            case 7: setObjects_estiloVisual(objects); break;
        }
    }

    /*
     * The variables declared in the rules.
     */
    private estilo.estrutura.Estilo estilo_estrutura_Estilo_1;

    /**
     * Class constructor.
     *
     * @param knowledgeBase the knowledge base that contains this rule base.
     */
    public Jeops_RuleBase_EstilosKB(jeops.AbstractKnowledgeBase knowledgeBase) {
        super(knowledgeBase);
    }

}
/**
 * Knowledge base created by JEOPS from file EstilosKB.rules
 *
 * @version 21/10/2015
 */
public class EstilosKB extends jeops.AbstractKnowledgeBase {

    /**
     * Creates a new knowledge base with the specified conflict set with the
     * desired conflict resolution policy.
     *
     * @param conflictSet a conflict set with the desired resolution policy
     */
    public EstilosKB(jeops.conflict.ConflictSet conflictSet) {
        super(conflictSet);
    }

    /**
     * Creates a new knowledge base, using the default conflict resolution
     * policy.
     */
    public EstilosKB() {
        this(new jeops.conflict.DefaultConflictSet());
    }

    /**
     * Factory method used to instantiate the rule base.
     */
    protected jeops.AbstractRuleBase createRuleBase() {
        return new Jeops_RuleBase_EstilosKB(this);
    }

}
