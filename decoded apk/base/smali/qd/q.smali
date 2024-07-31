.class public Lqd/q;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lzd/i2;

.field private final b:Lzd/n;

.field private final c:Lzd/t;

.field private final d:Lzd/s;

.field private final e:Lzd/r2;

.field private final f:Lfe/f;

.field private g:Z

.field private h:Lcom/google/firebase/inappmessaging/FirebaseInAppMessagingDisplay;

.field private i:Ljava/util/concurrent/Executor;
    .annotation build Ldc/c;
    .end annotation
.end field


# direct methods
.method constructor <init>(Lzd/i2;Lzd/r2;Lzd/n;Lfe/f;Lzd/t;Lzd/s;Ljava/util/concurrent/Executor;)V
    .locals 0
    .param p7    # Ljava/util/concurrent/Executor;
        .annotation build Ldc/c;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lqd/q;->a:Lzd/i2;

    iput-object p2, p0, Lqd/q;->e:Lzd/r2;

    iput-object p3, p0, Lqd/q;->b:Lzd/n;

    iput-object p4, p0, Lqd/q;->f:Lfe/f;

    const/4 p2, 0x0

    iput-boolean p2, p0, Lqd/q;->g:Z

    iput-object p5, p0, Lqd/q;->c:Lzd/t;

    iput-object p6, p0, Lqd/q;->d:Lzd/s;

    iput-object p7, p0, Lqd/q;->i:Ljava/util/concurrent/Executor;

    invoke-interface {p4}, Lfe/f;->getId()Lcom/google/android/gms/tasks/Task;

    move-result-object p2

    new-instance p3, Lqd/o;

    invoke-direct {p3}, Lqd/o;-><init>()V

    invoke-virtual {p2, p7, p3}, Lcom/google/android/gms/tasks/Task;->addOnSuccessListener(Ljava/util/concurrent/Executor;Lcom/google/android/gms/tasks/OnSuccessListener;)Lcom/google/android/gms/tasks/Task;

    invoke-virtual {p1}, Lzd/i2;->K()Ldj/f;

    move-result-object p1

    new-instance p2, Lqd/p;

    invoke-direct {p2, p0}, Lqd/p;-><init>(Lqd/q;)V

    invoke-virtual {p1, p2}, Ldj/f;->F(Ljj/d;)Lgj/b;

    return-void
.end method

.method public static synthetic a(Lqd/q;Lde/o;)V
    .locals 0

    invoke-direct {p0, p1}, Lqd/q;->l(Lde/o;)V

    return-void
.end method

.method public static synthetic b(Ljava/lang/String;)V
    .locals 0

    invoke-static {p0}, Lqd/q;->f(Ljava/lang/String;)V

    return-void
.end method

.method public static e()Lqd/q;
    .locals 2

    invoke-static {}, Lzb/g;->o()Lzb/g;

    move-result-object v0

    const-class v1, Lqd/q;

    invoke-virtual {v0, v1}, Lzb/g;->k(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lqd/q;

    return-object v0
.end method

.method private static synthetic f(Ljava/lang/String;)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Starting InAppMessaging runtime with Installation ID "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lzd/l2;->c(Ljava/lang/String;)V

    return-void
.end method

.method private l(Lde/o;)V
    .locals 4

    iget-object v0, p0, Lqd/q;->h:Lcom/google/firebase/inappmessaging/FirebaseInAppMessagingDisplay;

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lde/o;->a()Lde/i;

    move-result-object v1

    iget-object v2, p0, Lqd/q;->c:Lzd/t;

    invoke-virtual {p1}, Lde/o;->a()Lde/i;

    move-result-object v3

    invoke-virtual {p1}, Lde/o;->b()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, v3, p1}, Lzd/t;->a(Lde/i;Ljava/lang/String;)Lqd/t;

    move-result-object p1

    invoke-interface {v0, v1, p1}, Lcom/google/firebase/inappmessaging/FirebaseInAppMessagingDisplay;->displayMessage(Lde/i;Lqd/t;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public c()Z
    .locals 1

    iget-boolean v0, p0, Lqd/q;->g:Z

    return v0
.end method

.method public d()V
    .locals 1

    const-string v0, "Removing display event component"

    invoke-static {v0}, Lzd/l2;->c(Ljava/lang/String;)V

    const/4 v0, 0x0

    iput-object v0, p0, Lqd/q;->h:Lcom/google/firebase/inappmessaging/FirebaseInAppMessagingDisplay;

    return-void
.end method

.method public g()V
    .locals 1

    iget-object v0, p0, Lqd/q;->d:Lzd/s;

    invoke-virtual {v0}, Lzd/s;->m()V

    return-void
.end method

.method public h(Ljava/lang/Boolean;)V
    .locals 1

    iget-object v0, p0, Lqd/q;->b:Lzd/n;

    invoke-virtual {v0, p1}, Lzd/n;->f(Ljava/lang/Boolean;)V

    return-void
.end method

.method public i(Lcom/google/firebase/inappmessaging/FirebaseInAppMessagingDisplay;)V
    .locals 1

    const-string v0, "Setting display event component"

    invoke-static {v0}, Lzd/l2;->c(Ljava/lang/String;)V

    iput-object p1, p0, Lqd/q;->h:Lcom/google/firebase/inappmessaging/FirebaseInAppMessagingDisplay;

    return-void
.end method

.method public j(Ljava/lang/Boolean;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iput-boolean p1, p0, Lqd/q;->g:Z

    return-void
.end method

.method public k(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lqd/q;->e:Lzd/r2;

    invoke-virtual {v0, p1}, Lzd/r2;->b(Ljava/lang/String;)V

    return-void
.end method
