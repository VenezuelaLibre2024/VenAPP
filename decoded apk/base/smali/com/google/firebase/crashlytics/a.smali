.class public Lcom/google/firebase/crashlytics/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field final a:Lvc/r;


# direct methods
.method private constructor <init>(Lvc/r;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/firebase/crashlytics/a;->a:Lvc/r;

    return-void
.end method

.method public static d()Lcom/google/firebase/crashlytics/a;
    .locals 2

    invoke-static {}, Lzb/g;->o()Lzb/g;

    move-result-object v0

    const-class v1, Lcom/google/firebase/crashlytics/a;

    invoke-virtual {v0, v1}, Lzb/g;->k(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/firebase/crashlytics/a;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "FirebaseCrashlytics component is not present."

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method static e(Lzb/g;Lfe/f;Lee/a;Lee/a;Lee/a;)Lcom/google/firebase/crashlytics/a;
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lzb/g;",
            "Lfe/f;",
            "Lee/a<",
            "Lsc/a;",
            ">;",
            "Lee/a<",
            "Lcc/a;",
            ">;",
            "Lee/a<",
            "Lbf/a;",
            ">;)",
            "Lcom/google/firebase/crashlytics/a;"
        }
    .end annotation

    invoke-virtual/range {p0 .. p0}, Lzb/g;->m()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-static {}, Lsc/g;->f()Lsc/g;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Initializing Firebase Crashlytics "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Lvc/r;->l()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, " for "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lsc/g;->g(Ljava/lang/String;)V

    new-instance v15, Lad/f;

    invoke-direct {v15, v0}, Lad/f;-><init>(Landroid/content/Context;)V

    new-instance v3, Lvc/x;

    move-object/from16 v2, p0

    invoke-direct {v3, v2}, Lvc/x;-><init>(Lzb/g;)V

    new-instance v14, Lvc/b0;

    move-object/from16 v4, p1

    invoke-direct {v14, v0, v1, v4, v3}, Lvc/b0;-><init>(Landroid/content/Context;Ljava/lang/String;Lfe/f;Lvc/x;)V

    new-instance v7, Lsc/d;

    move-object/from16 v1, p2

    invoke-direct {v7, v1}, Lsc/d;-><init>(Lee/a;)V

    new-instance v1, Lrc/d;

    move-object/from16 v4, p3

    invoke-direct {v1, v4}, Lrc/d;-><init>(Lee/a;)V

    const-string v4, "Crashlytics Exception Handler"

    invoke-static {v4}, Lvc/z;->c(Ljava/lang/String;)Ljava/util/concurrent/ExecutorService;

    move-result-object v12

    new-instance v13, Lvc/m;

    invoke-direct {v13, v3, v15}, Lvc/m;-><init>(Lvc/x;Lad/f;)V

    invoke-static {v13}, Lef/a;->e(Lef/b;)V

    new-instance v11, Lsc/k;

    move-object/from16 v4, p4

    invoke-direct {v11, v4}, Lsc/k;-><init>(Lee/a;)V

    new-instance v10, Lvc/r;

    invoke-virtual {v1}, Lrc/d;->e()Luc/b;

    move-result-object v9

    invoke-virtual {v1}, Lrc/d;->d()Ltc/a;

    move-result-object v1

    move-object v4, v10

    move-object/from16 v5, p0

    move-object v6, v14

    move-object v8, v3

    move-object/from16 v16, v10

    move-object v10, v1

    move-object v1, v11

    move-object v11, v15

    move-object/from16 v17, v14

    move-object v14, v1

    invoke-direct/range {v4 .. v14}, Lvc/r;-><init>(Lzb/g;Lvc/b0;Lsc/a;Lvc/x;Luc/b;Ltc/a;Lad/f;Ljava/util/concurrent/ExecutorService;Lvc/m;Lsc/k;)V

    invoke-virtual/range {p0 .. p0}, Lzb/g;->r()Lzb/p;

    move-result-object v1

    invoke-virtual {v1}, Lzb/p;->c()Ljava/lang/String;

    move-result-object v7

    invoke-static {v0}, Lvc/i;->m(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v0}, Lvc/i;->j(Landroid/content/Context;)Ljava/util/List;

    move-result-object v5

    invoke-static {}, Lsc/g;->f()Lsc/g;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "Mapping file ID is: "

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lsc/g;->b(Ljava/lang/String;)V

    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lvc/f;

    invoke-static {}, Lsc/g;->f()Lsc/g;

    move-result-object v6

    const/4 v8, 0x3

    new-array v8, v8, [Ljava/lang/Object;

    invoke-virtual {v2}, Lvc/f;->c()Ljava/lang/String;

    move-result-object v9

    const/4 v10, 0x0

    aput-object v9, v8, v10

    const/4 v9, 0x1

    invoke-virtual {v2}, Lvc/f;->a()Ljava/lang/String;

    move-result-object v10

    aput-object v10, v8, v9

    const/4 v9, 0x2

    invoke-virtual {v2}, Lvc/f;->b()Ljava/lang/String;

    move-result-object v2

    aput-object v2, v8, v9

    const-string v2, "Build id for %s on %s: %s"

    invoke-static {v2, v8}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v6, v2}, Lsc/g;->b(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    new-instance v6, Lsc/f;

    invoke-direct {v6, v0}, Lsc/f;-><init>(Landroid/content/Context;)V

    move-object v1, v0

    move-object/from16 v2, v17

    move-object v8, v3

    move-object v3, v7

    :try_start_0
    invoke-static/range {v1 .. v6}, Lvc/a;->a(Landroid/content/Context;Lvc/b0;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lsc/f;)Lvc/a;

    move-result-object v9
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    invoke-static {}, Lsc/g;->f()Lsc/g;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Installer package name is: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, v9, Lvc/a;->d:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lsc/g;->i(Ljava/lang/String;)V

    const-string v1, "com.google.firebase.crashlytics.startup"

    invoke-static {v1}, Lvc/z;->c(Ljava/lang/String;)Ljava/util/concurrent/ExecutorService;

    move-result-object v10

    new-instance v4, Lzc/b;

    invoke-direct {v4}, Lzc/b;-><init>()V

    iget-object v5, v9, Lvc/a;->f:Ljava/lang/String;

    iget-object v6, v9, Lvc/a;->g:Ljava/lang/String;

    move-object v1, v0

    move-object v2, v7

    move-object/from16 v3, v17

    move-object v7, v15

    invoke-static/range {v1 .. v8}, Lcd/f;->l(Landroid/content/Context;Ljava/lang/String;Lvc/b0;Lzc/b;Ljava/lang/String;Ljava/lang/String;Lad/f;Lvc/x;)Lcd/f;

    move-result-object v0

    invoke-virtual {v0, v10}, Lcd/f;->p(Ljava/util/concurrent/Executor;)Lcom/google/android/gms/tasks/Task;

    move-result-object v1

    new-instance v2, Lcom/google/firebase/crashlytics/a$a;

    invoke-direct {v2}, Lcom/google/firebase/crashlytics/a$a;-><init>()V

    invoke-virtual {v1, v10, v2}, Lcom/google/android/gms/tasks/Task;->continueWith(Ljava/util/concurrent/Executor;Lcom/google/android/gms/tasks/Continuation;)Lcom/google/android/gms/tasks/Task;

    move-object/from16 v1, v16

    invoke-virtual {v1, v9, v0}, Lvc/r;->s(Lvc/a;Lcd/i;)Z

    move-result v2

    new-instance v3, Lcom/google/firebase/crashlytics/a$b;

    invoke-direct {v3, v2, v1, v0}, Lcom/google/firebase/crashlytics/a$b;-><init>(ZLvc/r;Lcd/f;)V

    invoke-static {v10, v3}, Lcom/google/android/gms/tasks/Tasks;->call(Ljava/util/concurrent/Executor;Ljava/util/concurrent/Callable;)Lcom/google/android/gms/tasks/Task;

    new-instance v0, Lcom/google/firebase/crashlytics/a;

    invoke-direct {v0, v1}, Lcom/google/firebase/crashlytics/a;-><init>(Lvc/r;)V

    return-object v0

    :catch_0
    move-exception v0

    move-object v1, v0

    invoke-static {}, Lsc/g;->f()Lsc/g;

    move-result-object v0

    const-string v2, "Error retrieving app package info."

    invoke-virtual {v0, v2, v1}, Lsc/g;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 v0, 0x0

    return-object v0
.end method


# virtual methods
.method public a()Lcom/google/android/gms/tasks/Task;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/firebase/crashlytics/a;->a:Lvc/r;

    invoke-virtual {v0}, Lvc/r;->e()Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    return-object v0
.end method

.method public b()V
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/crashlytics/a;->a:Lvc/r;

    invoke-virtual {v0}, Lvc/r;->f()Lcom/google/android/gms/tasks/Task;

    return-void
.end method

.method public c()Z
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/crashlytics/a;->a:Lvc/r;

    invoke-virtual {v0}, Lvc/r;->g()Z

    move-result v0

    return v0
.end method

.method public f(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/crashlytics/a;->a:Lvc/r;

    invoke-virtual {v0, p1}, Lvc/r;->n(Ljava/lang/String;)V

    return-void
.end method

.method public g(Ljava/lang/Throwable;)V
    .locals 1

    if-nez p1, :cond_0

    invoke-static {}, Lsc/g;->f()Lsc/g;

    move-result-object p1

    const-string v0, "A null value was passed to recordException. Ignoring."

    invoke-virtual {p1, v0}, Lsc/g;->k(Ljava/lang/String;)V

    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/firebase/crashlytics/a;->a:Lvc/r;

    invoke-virtual {v0, p1}, Lvc/r;->o(Ljava/lang/Throwable;)V

    return-void
.end method

.method public h()V
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/crashlytics/a;->a:Lvc/r;

    invoke-virtual {v0}, Lvc/r;->t()Lcom/google/android/gms/tasks/Task;

    return-void
.end method

.method public i(Ljava/lang/Boolean;)V
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/crashlytics/a;->a:Lvc/r;

    invoke-virtual {v0, p1}, Lvc/r;->u(Ljava/lang/Boolean;)V

    return-void
.end method

.method public j(Z)V
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/crashlytics/a;->a:Lvc/r;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {v0, p1}, Lvc/r;->u(Ljava/lang/Boolean;)V

    return-void
.end method

.method public k(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/crashlytics/a;->a:Lvc/r;

    invoke-virtual {v0, p1, p2}, Lvc/r;->v(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public l(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/crashlytics/a;->a:Lvc/r;

    invoke-virtual {v0, p1}, Lvc/r;->x(Ljava/lang/String;)V

    return-void
.end method
