.class public Lcom/google/firebase/inappmessaging/display/FirebaseInAppMessagingDisplayRegistrar;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/firebase/components/ComponentRegistrar;


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation


# static fields
.field private static final LIBRARY_NAME:Ljava/lang/String; = "fire-fiamd"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lcom/google/firebase/inappmessaging/display/FirebaseInAppMessagingDisplayRegistrar;Lpc/d;)Lsd/b;
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/firebase/inappmessaging/display/FirebaseInAppMessagingDisplayRegistrar;->buildFirebaseInAppMessagingUI(Lpc/d;)Lsd/b;

    move-result-object p0

    return-object p0
.end method

.method private buildFirebaseInAppMessagingUI(Lpc/d;)Lsd/b;
    .locals 3

    const-class v0, Lzb/g;

    invoke-interface {p1, v0}, Lpc/d;->get(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lzb/g;

    const-class v1, Lqd/q;

    invoke-interface {p1, v1}, Lpc/d;->get(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lqd/q;

    invoke-virtual {v0}, Lzb/g;->m()Landroid/content/Context;

    move-result-object v0

    check-cast v0, Landroid/app/Application;

    invoke-static {}, Lwd/d;->a()Lwd/d$b;

    move-result-object v1

    new-instance v2, Lxd/a;

    invoke-direct {v2, v0}, Lxd/a;-><init>(Landroid/app/Application;)V

    invoke-virtual {v1, v2}, Lwd/d$b;->a(Lxd/a;)Lwd/d$b;

    move-result-object v1

    invoke-virtual {v1}, Lwd/d$b;->b()Lwd/f;

    move-result-object v1

    invoke-static {}, Lwd/b;->a()Lwd/b$c;

    move-result-object v2

    invoke-virtual {v2, v1}, Lwd/b$c;->c(Lwd/f;)Lwd/b$c;

    move-result-object v1

    new-instance v2, Lxd/e;

    invoke-direct {v2, p1}, Lxd/e;-><init>(Lqd/q;)V

    invoke-virtual {v1, v2}, Lwd/b$c;->b(Lxd/e;)Lwd/b$c;

    move-result-object p1

    invoke-virtual {p1}, Lwd/b$c;->a()Lwd/a;

    move-result-object p1

    invoke-interface {p1}, Lwd/a;->a()Lsd/b;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/app/Application;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    return-object p1
.end method


# virtual methods
.method public getComponents()Ljava/util/List;
    .locals 4
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lpc/c<",
            "*>;>;"
        }
    .end annotation

    const/4 v0, 0x2

    new-array v0, v0, [Lpc/c;

    const-class v1, Lsd/b;

    invoke-static {v1}, Lpc/c;->c(Ljava/lang/Class;)Lpc/c$b;

    move-result-object v1

    const-string v2, "fire-fiamd"

    invoke-virtual {v1, v2}, Lpc/c$b;->h(Ljava/lang/String;)Lpc/c$b;

    move-result-object v1

    const-class v3, Lzb/g;

    invoke-static {v3}, Lpc/q;->j(Ljava/lang/Class;)Lpc/q;

    move-result-object v3

    invoke-virtual {v1, v3}, Lpc/c$b;->b(Lpc/q;)Lpc/c$b;

    move-result-object v1

    const-class v3, Lqd/q;

    invoke-static {v3}, Lpc/q;->j(Ljava/lang/Class;)Lpc/q;

    move-result-object v3

    invoke-virtual {v1, v3}, Lpc/c$b;->b(Lpc/q;)Lpc/c$b;

    move-result-object v1

    new-instance v3, Lsd/c;

    invoke-direct {v3, p0}, Lsd/c;-><init>(Lcom/google/firebase/inappmessaging/display/FirebaseInAppMessagingDisplayRegistrar;)V

    invoke-virtual {v1, v3}, Lpc/c$b;->f(Lpc/g;)Lpc/c$b;

    move-result-object v1

    invoke-virtual {v1}, Lpc/c$b;->e()Lpc/c$b;

    move-result-object v1

    invoke-virtual {v1}, Lpc/c$b;->d()Lpc/c;

    move-result-object v1

    const/4 v3, 0x0

    aput-object v1, v0, v3

    const-string v1, "20.4.0"

    invoke-static {v2, v1}, Lye/h;->b(Ljava/lang/String;Ljava/lang/String;)Lpc/c;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
