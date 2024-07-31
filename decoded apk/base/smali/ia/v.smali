.class public final Lia/v;
.super Lcom/google/android/gms/common/api/e;
.source "SourceFile"

# interfaces
.implements Lha/d;


# static fields
.field private static final a:Lcom/google/android/gms/common/api/a$g;

.field private static final b:Lcom/google/android/gms/common/api/a$a;

.field private static final c:Lcom/google/android/gms/common/api/a;

.field public static final synthetic d:I


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/google/android/gms/common/api/a$g;

    invoke-direct {v0}, Lcom/google/android/gms/common/api/a$g;-><init>()V

    sput-object v0, Lia/v;->a:Lcom/google/android/gms/common/api/a$g;

    new-instance v1, Lia/q;

    invoke-direct {v1}, Lia/q;-><init>()V

    sput-object v1, Lia/v;->b:Lcom/google/android/gms/common/api/a$a;

    new-instance v2, Lcom/google/android/gms/common/api/a;

    const-string v3, "ModuleInstall.API"

    invoke-direct {v2, v3, v1, v0}, Lcom/google/android/gms/common/api/a;-><init>(Ljava/lang/String;Lcom/google/android/gms/common/api/a$a;Lcom/google/android/gms/common/api/a$g;)V

    sput-object v2, Lia/v;->c:Lcom/google/android/gms/common/api/a;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 3

    sget-object v0, Lia/v;->c:Lcom/google/android/gms/common/api/a;

    sget-object v1, Lcom/google/android/gms/common/api/a$d;->l:Lcom/google/android/gms/common/api/a$d$c;

    sget-object v2, Lcom/google/android/gms/common/api/e$a;->c:Lcom/google/android/gms/common/api/e$a;

    invoke-direct {p0, p1, v0, v1, v2}, Lcom/google/android/gms/common/api/e;-><init>(Landroid/content/Context;Lcom/google/android/gms/common/api/a;Lcom/google/android/gms/common/api/a$d;Lcom/google/android/gms/common/api/e$a;)V

    return-void
.end method

.method static final varargs d(Z[Lcom/google/android/gms/common/api/g;)Lia/a;
    .locals 4

    const-string v0, "Requested APIs must not be null."

    invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/s;->k(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    array-length v0, p1

    const/4 v1, 0x0

    if-lez v0, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    move v2, v1

    :goto_0
    const-string v3, "Please provide at least one OptionalModuleApi."

    invoke-static {v2, v3}, Lcom/google/android/gms/common/internal/s;->b(ZLjava/lang/Object;)V

    :goto_1
    if-ge v1, v0, :cond_1

    aget-object v2, p1, v1

    const-string v3, "Requested API must not be null."

    invoke-static {v2, v3}, Lcom/google/android/gms/common/internal/s;->k(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_1
    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-static {p1, p0}, Lia/a;->w1(Ljava/util/List;Z)Lia/a;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final b(Lha/f;)Lcom/google/android/gms/tasks/Task;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lha/f;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Lha/g;",
            ">;"
        }
    .end annotation

    invoke-static {p1}, Lia/a;->u1(Lha/f;)Lia/a;

    move-result-object v4

    invoke-virtual {p1}, Lha/f;->b()Lha/a;

    move-result-object v3

    invoke-virtual {p1}, Lha/f;->c()Ljava/util/concurrent/Executor;

    move-result-object v0

    invoke-virtual {p1}, Lha/f;->e()Z

    move-result p1

    invoke-virtual {v4}, Lia/a;->v1()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    const/4 v6, 0x0

    if-eqz v1, :cond_0

    new-instance p1, Lha/g;

    invoke-direct {p1, v6}, Lha/g;-><init>(I)V

    invoke-static {p1}, Lcom/google/android/gms/tasks/Tasks;->forResult(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    goto/16 :goto_1

    :cond_0
    const/4 v7, 0x1

    if-nez v3, :cond_1

    invoke-static {}, Lcom/google/android/gms/common/api/internal/w;->a()Lcom/google/android/gms/common/api/internal/w$a;

    move-result-object v0

    new-array v1, v7, [Lca/d;

    sget-object v2, Lcom/google/android/gms/internal/base/zav;->zaa:Lca/d;

    aput-object v2, v1, v6

    invoke-virtual {v0, v1}, Lcom/google/android/gms/common/api/internal/w$a;->d([Lca/d;)Lcom/google/android/gms/common/api/internal/w$a;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/common/api/internal/w$a;->c(Z)Lcom/google/android/gms/common/api/internal/w$a;

    const/16 p1, 0x6aa8

    invoke-virtual {v0, p1}, Lcom/google/android/gms/common/api/internal/w$a;->e(I)Lcom/google/android/gms/common/api/internal/w$a;

    new-instance p1, Lia/o;

    invoke-direct {p1, p0, v4}, Lia/o;-><init>(Lia/v;Lia/a;)V

    invoke-virtual {v0, p1}, Lcom/google/android/gms/common/api/internal/w$a;->b(Lcom/google/android/gms/common/api/internal/r;)Lcom/google/android/gms/common/api/internal/w$a;

    invoke-virtual {v0}, Lcom/google/android/gms/common/api/internal/w$a;->a()Lcom/google/android/gms/common/api/internal/w;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/common/api/e;->doRead(Lcom/google/android/gms/common/api/internal/w;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    goto :goto_1

    :cond_1
    invoke-static {v3}, Lcom/google/android/gms/common/internal/s;->j(Ljava/lang/Object;)Ljava/lang/Object;

    const-class v1, Lha/a;

    if-nez v0, :cond_2

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v3, v0}, Lcom/google/android/gms/common/api/e;->registerListener(Ljava/lang/Object;Ljava/lang/String;)Lcom/google/android/gms/common/api/internal/k;

    move-result-object v0

    goto :goto_0

    :cond_2
    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v3, v0, v1}, Lcom/google/android/gms/common/api/internal/l;->b(Ljava/lang/Object;Ljava/util/concurrent/Executor;Ljava/lang/String;)Lcom/google/android/gms/common/api/internal/k;

    move-result-object v0

    :goto_0
    move-object v8, v0

    new-instance v9, Lia/d;

    invoke-direct {v9, v8}, Lia/d;-><init>(Lcom/google/android/gms/common/api/internal/k;)V

    new-instance v10, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v10}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    new-instance v11, Lia/l;

    move-object v0, v11

    move-object v1, p0

    move-object v2, v10

    move-object v5, v9

    invoke-direct/range {v0 .. v5}, Lia/l;-><init>(Lia/v;Ljava/util/concurrent/atomic/AtomicReference;Lha/a;Lia/a;Lia/d;)V

    new-instance v0, Lia/m;

    invoke-direct {v0, p0, v9}, Lia/m;-><init>(Lia/v;Lia/d;)V

    invoke-static {}, Lcom/google/android/gms/common/api/internal/q;->a()Lcom/google/android/gms/common/api/internal/q$a;

    move-result-object v1

    invoke-virtual {v1, v8}, Lcom/google/android/gms/common/api/internal/q$a;->g(Lcom/google/android/gms/common/api/internal/k;)Lcom/google/android/gms/common/api/internal/q$a;

    new-array v2, v7, [Lca/d;

    sget-object v3, Lcom/google/android/gms/internal/base/zav;->zaa:Lca/d;

    aput-object v3, v2, v6

    invoke-virtual {v1, v2}, Lcom/google/android/gms/common/api/internal/q$a;->d([Lca/d;)Lcom/google/android/gms/common/api/internal/q$a;

    invoke-virtual {v1, p1}, Lcom/google/android/gms/common/api/internal/q$a;->c(Z)Lcom/google/android/gms/common/api/internal/q$a;

    invoke-virtual {v1, v11}, Lcom/google/android/gms/common/api/internal/q$a;->b(Lcom/google/android/gms/common/api/internal/r;)Lcom/google/android/gms/common/api/internal/q$a;

    invoke-virtual {v1, v0}, Lcom/google/android/gms/common/api/internal/q$a;->f(Lcom/google/android/gms/common/api/internal/r;)Lcom/google/android/gms/common/api/internal/q$a;

    const/16 p1, 0x6aa9

    invoke-virtual {v1, p1}, Lcom/google/android/gms/common/api/internal/q$a;->e(I)Lcom/google/android/gms/common/api/internal/q$a;

    invoke-virtual {v1}, Lcom/google/android/gms/common/api/internal/q$a;->a()Lcom/google/android/gms/common/api/internal/q;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/common/api/e;->doRegisterEventListener(Lcom/google/android/gms/common/api/internal/q;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    new-instance v0, Lia/n;

    invoke-direct {v0, v10}, Lia/n;-><init>(Ljava/util/concurrent/atomic/AtomicReference;)V

    invoke-virtual {p1, v0}, Lcom/google/android/gms/tasks/Task;->onSuccessTask(Lcom/google/android/gms/tasks/SuccessContinuation;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    :goto_1
    return-object p1
.end method

.method public final varargs c([Lcom/google/android/gms/common/api/g;)Lcom/google/android/gms/tasks/Task;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Lcom/google/android/gms/common/api/g;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Lha/b;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-static {v0, p1}, Lia/v;->d(Z[Lcom/google/android/gms/common/api/g;)Lia/a;

    move-result-object p1

    invoke-virtual {p1}, Lia/a;->v1()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    new-instance p1, Lha/b;

    invoke-direct {p1, v2, v0}, Lha/b;-><init>(ZI)V

    invoke-static {p1}, Lcom/google/android/gms/tasks/Tasks;->forResult(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-static {}, Lcom/google/android/gms/common/api/internal/w;->a()Lcom/google/android/gms/common/api/internal/w$a;

    move-result-object v1

    new-array v2, v2, [Lca/d;

    sget-object v3, Lcom/google/android/gms/internal/base/zav;->zaa:Lca/d;

    aput-object v3, v2, v0

    invoke-virtual {v1, v2}, Lcom/google/android/gms/common/api/internal/w$a;->d([Lca/d;)Lcom/google/android/gms/common/api/internal/w$a;

    const/16 v2, 0x6aa5

    invoke-virtual {v1, v2}, Lcom/google/android/gms/common/api/internal/w$a;->e(I)Lcom/google/android/gms/common/api/internal/w$a;

    invoke-virtual {v1, v0}, Lcom/google/android/gms/common/api/internal/w$a;->c(Z)Lcom/google/android/gms/common/api/internal/w$a;

    new-instance v0, Lia/p;

    invoke-direct {v0, p0, p1}, Lia/p;-><init>(Lia/v;Lia/a;)V

    invoke-virtual {v1, v0}, Lcom/google/android/gms/common/api/internal/w$a;->b(Lcom/google/android/gms/common/api/internal/r;)Lcom/google/android/gms/common/api/internal/w$a;

    invoke-virtual {v1}, Lcom/google/android/gms/common/api/internal/w$a;->a()Lcom/google/android/gms/common/api/internal/w;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/common/api/e;->doRead(Lcom/google/android/gms/common/api/internal/w;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method
