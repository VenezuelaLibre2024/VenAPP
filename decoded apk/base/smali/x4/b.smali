.class public final Lx4/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lx4/b;

.field private static b:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lx4/b;

    invoke-direct {v0}, Lx4/b;-><init>()V

    sput-object v0, Lx4/b;->a:Lx4/b;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lx4/c;Li4/n0;)V
    .locals 0

    invoke-static {p0, p1}, Lx4/b;->f(Lx4/c;Li4/n0;)V

    return-void
.end method

.method public static final b()V
    .locals 1

    const/4 v0, 0x1

    sput-boolean v0, Lx4/b;->b:Z

    invoke-static {}, Li4/e0;->p()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lx4/b;->a:Lx4/b;

    invoke-virtual {v0}, Lx4/b;->e()V

    :cond_0
    return-void
.end method

.method public static final c(Ljava/lang/Throwable;)V
    .locals 5

    sget-boolean v0, Lx4/b;->b:Z

    if-eqz v0, :cond_3

    invoke-static {}, Lx4/b;->d()Z

    move-result v0

    if-nez v0, :cond_3

    if-nez p0, :cond_0

    goto :goto_1

    :cond_0
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    invoke-virtual {p0}, Ljava/lang/Throwable;->getStackTrace()[Ljava/lang/StackTraceElement;

    move-result-object p0

    const-string v1, "e.stackTrace"

    invoke-static {p0, v1}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v1, p0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_2

    aget-object v3, p0, v2

    sget-object v4, Lcom/facebook/internal/n;->a:Lcom/facebook/internal/n;

    invoke-virtual {v3}, Ljava/lang/StackTraceElement;->getClassName()Ljava/lang/String;

    move-result-object v3

    const-string v4, "it.className"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v3}, Lcom/facebook/internal/n;->d(Ljava/lang/String;)Lcom/facebook/internal/n$b;

    move-result-object v3

    sget-object v4, Lcom/facebook/internal/n$b;->Unknown:Lcom/facebook/internal/n$b;

    if-eq v3, v4, :cond_1

    invoke-static {v3}, Lcom/facebook/internal/n;->c(Lcom/facebook/internal/n$b;)V

    invoke-virtual {v3}, Lcom/facebook/internal/n$b;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    invoke-static {}, Li4/e0;->p()Z

    move-result p0

    if-eqz p0, :cond_3

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result p0

    xor-int/lit8 p0, p0, 0x1

    if-eqz p0, :cond_3

    sget-object p0, Lx4/c$a;->a:Lx4/c$a;

    new-instance p0, Lorg/json/JSONArray;

    invoke-direct {p0, v0}, Lorg/json/JSONArray;-><init>(Ljava/util/Collection;)V

    invoke-static {p0}, Lx4/c$a;->c(Lorg/json/JSONArray;)Lx4/c;

    move-result-object p0

    invoke-virtual {p0}, Lx4/c;->g()V

    :cond_3
    :goto_1
    return-void
.end method

.method public static final d()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method private static final f(Lx4/c;Li4/n0;)V
    .locals 1

    const-string v0, "$instrumentData"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "response"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    invoke-virtual {p1}, Li4/n0;->b()Li4/u;

    move-result-object v0

    if-nez v0, :cond_1

    invoke-virtual {p1}, Li4/n0;->d()Lorg/json/JSONObject;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    const-string v0, "success"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getBoolean(Ljava/lang/String;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    :goto_0
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-virtual {p0}, Lx4/c;->a()V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_1
    return-void
.end method


# virtual methods
.method public final e()V
    .locals 12

    invoke-static {}, Lcom/facebook/internal/n0;->a0()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    invoke-static {}, Lx4/k;->n()[Ljava/io/File;

    move-result-object v0

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    array-length v2, v0

    const/4 v3, 0x0

    move v4, v3

    :catch_0
    :cond_1
    :goto_0
    if-ge v4, v2, :cond_2

    aget-object v5, v0, v4

    add-int/lit8 v4, v4, 0x1

    invoke-static {v5}, Lx4/c$a;->d(Ljava/io/File;)Lx4/c;

    move-result-object v5

    invoke-virtual {v5}, Lx4/c;->f()Z

    move-result v6

    if-eqz v6, :cond_1

    new-instance v6, Lorg/json/JSONObject;

    invoke-direct {v6}, Lorg/json/JSONObject;-><init>()V

    :try_start_0
    const-string v7, "crash_shield"

    invoke-virtual {v5}, Lx4/c;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v6, v7, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    sget-object v7, Li4/i0;->n:Li4/i0$c;

    sget-object v8, Lkotlin/jvm/internal/a0;->a:Lkotlin/jvm/internal/a0;

    const-string v8, "%s/instruments"

    const/4 v9, 0x1

    new-array v10, v9, [Ljava/lang/Object;

    invoke-static {}, Li4/e0;->m()Ljava/lang/String;

    move-result-object v11

    aput-object v11, v10, v3

    invoke-static {v10, v9}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v9

    invoke-static {v8, v9}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    const-string v9, "java.lang.String.format(format, *args)"

    invoke-static {v8, v9}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v9, Lx4/a;

    invoke-direct {v9, v5}, Lx4/a;-><init>(Lx4/c;)V

    const/4 v5, 0x0

    invoke-virtual {v7, v5, v8, v6, v9}, Li4/i0$c;->A(Li4/a;Ljava/lang/String;Lorg/json/JSONObject;Li4/i0$b;)Li4/i0;

    move-result-object v5

    invoke-interface {v1, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :cond_2
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_3

    return-void

    :cond_3
    new-instance v0, Li4/m0;

    invoke-direct {v0, v1}, Li4/m0;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v0}, Li4/m0;->m()Li4/l0;

    return-void
.end method
