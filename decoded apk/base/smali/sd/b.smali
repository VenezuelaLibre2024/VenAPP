.class public Lsd/b;
.super Lud/i;
.source "SourceFile"


# instance fields
.field private final a:Lqd/q;

.field private final b:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lbk/a<",
            "Lud/l;",
            ">;>;"
        }
    .end annotation
.end field

.field private final c:Lud/e;

.field private final d:Lud/n;

.field private final e:Lud/n;

.field private final f:Lud/g;

.field private final r:Lud/a;

.field private final s:Landroid/app/Application;

.field private final t:Lud/c;

.field private u:Lcom/google/firebase/inappmessaging/display/FiamListener;

.field private v:Lde/i;

.field private w:Lqd/t;

.field x:Ljava/lang/String;


# direct methods
.method constructor <init>(Lqd/q;Ljava/util/Map;Lud/e;Lud/n;Lud/n;Lud/g;Landroid/app/Application;Lud/a;Lud/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lqd/q;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lbk/a<",
            "Lud/l;",
            ">;>;",
            "Lud/e;",
            "Lud/n;",
            "Lud/n;",
            "Lud/g;",
            "Landroid/app/Application;",
            "Lud/a;",
            "Lud/c;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Lud/i;-><init>()V

    iput-object p1, p0, Lsd/b;->a:Lqd/q;

    iput-object p2, p0, Lsd/b;->b:Ljava/util/Map;

    iput-object p3, p0, Lsd/b;->c:Lud/e;

    iput-object p4, p0, Lsd/b;->d:Lud/n;

    iput-object p5, p0, Lsd/b;->e:Lud/n;

    iput-object p6, p0, Lsd/b;->f:Lud/g;

    iput-object p7, p0, Lsd/b;->s:Landroid/app/Application;

    iput-object p8, p0, Lsd/b;->r:Lud/a;

    iput-object p9, p0, Lsd/b;->t:Lud/c;

    return-void
.end method

.method private A(Landroid/app/Activity;Landroid/net/Uri;)V
    .locals 4

    invoke-direct {p0, p2}, Lsd/b;->y(Landroid/net/Uri;)Z

    move-result v0

    const/high16 v1, 0x10000000

    const/high16 v2, 0x40000000    # 2.0f

    if-eqz v0, :cond_0

    invoke-direct {p0, p1}, Lsd/b;->H(Landroid/app/Activity;)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Landroidx/browser/customtabs/d$b;

    invoke-direct {v0}, Landroidx/browser/customtabs/d$b;-><init>()V

    invoke-virtual {v0}, Landroidx/browser/customtabs/d$b;->b()Landroidx/browser/customtabs/d;

    move-result-object v0

    iget-object v3, v0, Landroidx/browser/customtabs/d;->a:Landroid/content/Intent;

    invoke-virtual {v3, v2}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    invoke-virtual {v3, v1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    invoke-virtual {v0, p1, p2}, Landroidx/browser/customtabs/d;->b(Landroid/content/Context;Landroid/net/Uri;)V

    goto :goto_0

    :cond_0
    new-instance v0, Landroid/content/Intent;

    const-string v3, "android.intent.action.VIEW"

    invoke-direct {v0, v3, p2}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object p2

    const/4 v3, 0x0

    invoke-virtual {p2, v0, v3}, Landroid/content/pm/PackageManager;->resolveActivity(Landroid/content/Intent;I)Landroid/content/pm/ResolveInfo;

    move-result-object p2

    invoke-virtual {v0, v2}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    invoke-virtual {v0, v1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    if-eqz p2, :cond_1

    invoke-virtual {p1, v0}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    goto :goto_0

    :cond_1
    const-string p1, "Device cannot resolve intent for: android.intent.action.VIEW"

    invoke-static {p1}, Lud/m;->e(Ljava/lang/String;)V

    :goto_0
    return-void
.end method

.method private B(Landroid/app/Activity;Lvd/c;Lde/g;Lud/e$a;)V
    .locals 1

    invoke-direct {p0, p3}, Lsd/b;->x(Lde/g;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lsd/b;->c:Lud/e;

    invoke-virtual {p3}, Lde/g;->b()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {v0, p3}, Lud/e;->c(Ljava/lang/String;)Lud/e$b;

    move-result-object p3

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p3, p1}, Lud/e$b;->d(Ljava/lang/Class;)Lud/e$b;

    move-result-object p1

    sget p3, Lsd/e;->a:I

    invoke-virtual {p1, p3}, Lud/e$b;->c(I)Lud/e$b;

    move-result-object p1

    invoke-virtual {p2}, Lvd/c;->e()Landroid/widget/ImageView;

    move-result-object p2

    invoke-virtual {p1, p2, p4}, Lud/e$b;->b(Landroid/widget/ImageView;Lud/e$a;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p4}, Lud/e$a;->k()V

    :goto_0
    return-void
.end method

.method private C()V
    .locals 1

    iget-object v0, p0, Lsd/b;->u:Lcom/google/firebase/inappmessaging/display/FiamListener;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/google/firebase/inappmessaging/display/FiamListener;->onFiamClick()V

    :cond_0
    return-void
.end method

.method private D()V
    .locals 1

    iget-object v0, p0, Lsd/b;->u:Lcom/google/firebase/inappmessaging/display/FiamListener;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/google/firebase/inappmessaging/display/FiamListener;->onFiamDismiss()V

    :cond_0
    return-void
.end method

.method private E()V
    .locals 1

    iget-object v0, p0, Lsd/b;->u:Lcom/google/firebase/inappmessaging/display/FiamListener;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/google/firebase/inappmessaging/display/FiamListener;->onFiamTrigger()V

    :cond_0
    return-void
.end method

.method private F(Landroid/app/Activity;)V
    .locals 2

    iget-object v0, p0, Lsd/b;->f:Lud/g;

    invoke-virtual {v0}, Lud/g;->h()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lsd/b;->c:Lud/e;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v0, v1}, Lud/e;->b(Ljava/lang/Class;)V

    iget-object v0, p0, Lsd/b;->f:Lud/g;

    invoke-virtual {v0, p1}, Lud/g;->a(Landroid/app/Activity;)V

    invoke-direct {p0}, Lsd/b;->r()V

    :cond_0
    return-void
.end method

.method private G(Landroid/app/Activity;)V
    .locals 3

    iget-object v0, p0, Lsd/b;->v:Lde/i;

    if-eqz v0, :cond_6

    iget-object v0, p0, Lsd/b;->a:Lqd/q;

    invoke-virtual {v0}, Lqd/q;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    goto/16 :goto_1

    :cond_0
    iget-object v0, p0, Lsd/b;->v:Lde/i;

    invoke-virtual {v0}, Lde/i;->c()Lcom/google/firebase/inappmessaging/model/MessageType;

    move-result-object v0

    sget-object v1, Lcom/google/firebase/inappmessaging/model/MessageType;->UNSUPPORTED:Lcom/google/firebase/inappmessaging/model/MessageType;

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string p1, "The message being triggered is not supported by this version of the sdk."

    invoke-static {p1}, Lud/m;->e(Ljava/lang/String;)V

    return-void

    :cond_1
    invoke-direct {p0}, Lsd/b;->E()V

    iget-object v0, p0, Lsd/b;->b:Ljava/util/Map;

    iget-object v1, p0, Lsd/b;->v:Lde/i;

    invoke-virtual {v1}, Lde/i;->c()Lcom/google/firebase/inappmessaging/model/MessageType;

    move-result-object v1

    iget-object v2, p0, Lsd/b;->s:Landroid/app/Application;

    invoke-static {v2}, Lsd/b;->v(Landroid/app/Application;)I

    move-result v2

    invoke-static {v1, v2}, Lxd/g;->a(Lcom/google/firebase/inappmessaging/model/MessageType;I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lbk/a;

    invoke-interface {v0}, Lbk/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lud/l;

    sget-object v1, Lsd/b$e;->a:[I

    iget-object v2, p0, Lsd/b;->v:Lde/i;

    invoke-virtual {v2}, Lde/i;->c()Lcom/google/firebase/inappmessaging/model/MessageType;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v1, v1, v2

    const/4 v2, 0x1

    if-eq v1, v2, :cond_5

    const/4 v2, 0x2

    if-eq v1, v2, :cond_4

    const/4 v2, 0x3

    if-eq v1, v2, :cond_3

    const/4 v2, 0x4

    if-eq v1, v2, :cond_2

    const-string p1, "No bindings found for this message type"

    invoke-static {p1}, Lud/m;->e(Ljava/lang/String;)V

    return-void

    :cond_2
    iget-object v1, p0, Lsd/b;->r:Lud/a;

    iget-object v2, p0, Lsd/b;->v:Lde/i;

    invoke-virtual {v1, v0, v2}, Lud/a;->b(Lud/l;Lde/i;)Lvd/c;

    move-result-object v0

    goto :goto_0

    :cond_3
    iget-object v1, p0, Lsd/b;->r:Lud/a;

    iget-object v2, p0, Lsd/b;->v:Lde/i;

    invoke-virtual {v1, v0, v2}, Lud/a;->c(Lud/l;Lde/i;)Lvd/c;

    move-result-object v0

    goto :goto_0

    :cond_4
    iget-object v1, p0, Lsd/b;->r:Lud/a;

    iget-object v2, p0, Lsd/b;->v:Lde/i;

    invoke-virtual {v1, v0, v2}, Lud/a;->d(Lud/l;Lde/i;)Lvd/c;

    move-result-object v0

    goto :goto_0

    :cond_5
    iget-object v1, p0, Lsd/b;->r:Lud/a;

    iget-object v2, p0, Lsd/b;->v:Lde/i;

    invoke-virtual {v1, v0, v2}, Lud/a;->a(Lud/l;Lde/i;)Lvd/c;

    move-result-object v0

    :goto_0
    const v1, 0x1020002

    invoke-virtual {p1, v1}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v1

    new-instance v2, Lsd/b$a;

    invoke-direct {v2, p0, p1, v0}, Lsd/b$a;-><init>(Lsd/b;Landroid/app/Activity;Lvd/c;)V

    invoke-virtual {v1, v2}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    return-void

    :cond_6
    :goto_1
    const-string p1, "No active message found to render"

    invoke-static {p1}, Lud/m;->e(Ljava/lang/String;)V

    return-void
.end method

.method private H(Landroid/app/Activity;)Z
    .locals 2

    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.support.customtabs.action.CustomTabsService"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string v1, "com.android.chrome"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object p1

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/content/pm/PackageManager;->queryIntentServices(Landroid/content/Intent;I)Ljava/util/List;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_0

    const/4 v1, 0x1

    :cond_0
    return v1
.end method

.method private I(Landroid/app/Activity;)V
    .locals 2

    iget-object v0, p0, Lsd/b;->x:Ljava/lang/String;

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Landroid/app/Activity;->getLocalClassName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Unbinding from activity: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Landroid/app/Activity;->getLocalClassName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lud/m;->f(Ljava/lang/String;)V

    iget-object v0, p0, Lsd/b;->a:Lqd/q;

    invoke-virtual {v0}, Lqd/q;->d()V

    invoke-direct {p0, p1}, Lsd/b;->F(Landroid/app/Activity;)V

    const/4 p1, 0x0

    iput-object p1, p0, Lsd/b;->x:Ljava/lang/String;

    :cond_0
    return-void
.end method

.method public static synthetic a(Lsd/b;Landroid/app/Activity;Lde/i;Lqd/t;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lsd/b;->z(Landroid/app/Activity;Lde/i;Lqd/t;)V

    return-void
.end method

.method static synthetic b(Lsd/b;Landroid/app/Activity;Lvd/c;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lsd/b;->w(Landroid/app/Activity;Lvd/c;)V

    return-void
.end method

.method static synthetic c(Lsd/b;)Lqd/t;
    .locals 0

    iget-object p0, p0, Lsd/b;->w:Lqd/t;

    return-object p0
.end method

.method static synthetic d(Lsd/b;)Landroid/app/Application;
    .locals 0

    iget-object p0, p0, Lsd/b;->s:Landroid/app/Application;

    return-object p0
.end method

.method static synthetic e(Lsd/b;Lqd/t;)Lqd/t;
    .locals 0

    iput-object p1, p0, Lsd/b;->w:Lqd/t;

    return-object p1
.end method

.method static synthetic f(Lsd/b;)Lud/c;
    .locals 0

    iget-object p0, p0, Lsd/b;->t:Lud/c;

    return-object p0
.end method

.method static synthetic g(Lsd/b;)V
    .locals 0

    invoke-direct {p0}, Lsd/b;->r()V

    return-void
.end method

.method static synthetic h(Lsd/b;Landroid/app/Activity;)V
    .locals 0

    invoke-direct {p0, p1}, Lsd/b;->s(Landroid/app/Activity;)V

    return-void
.end method

.method static synthetic i(Lsd/b;Landroid/app/Activity;Landroid/net/Uri;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lsd/b;->A(Landroid/app/Activity;Landroid/net/Uri;)V

    return-void
.end method

.method static synthetic j(Lsd/b;)V
    .locals 0

    invoke-direct {p0}, Lsd/b;->C()V

    return-void
.end method

.method static synthetic k(Lsd/b;Landroid/app/Activity;)V
    .locals 0

    invoke-direct {p0, p1}, Lsd/b;->F(Landroid/app/Activity;)V

    return-void
.end method

.method static synthetic l(Lsd/b;)Lde/i;
    .locals 0

    iget-object p0, p0, Lsd/b;->v:Lde/i;

    return-object p0
.end method

.method static synthetic m(Lsd/b;Lde/i;)Lde/i;
    .locals 0

    iput-object p1, p0, Lsd/b;->v:Lde/i;

    return-object p1
.end method

.method static synthetic n(Lsd/b;)Lud/n;
    .locals 0

    iget-object p0, p0, Lsd/b;->d:Lud/n;

    return-object p0
.end method

.method static synthetic o(Lsd/b;)Lud/n;
    .locals 0

    iget-object p0, p0, Lsd/b;->e:Lud/n;

    return-object p0
.end method

.method static synthetic p(Lsd/b;)Lud/g;
    .locals 0

    iget-object p0, p0, Lsd/b;->f:Lud/g;

    return-object p0
.end method

.method private q(Landroid/app/Activity;)V
    .locals 2

    iget-object v0, p0, Lsd/b;->x:Ljava/lang/String;

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Landroid/app/Activity;->getLocalClassName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Binding to activity: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Landroid/app/Activity;->getLocalClassName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lud/m;->f(Ljava/lang/String;)V

    iget-object v0, p0, Lsd/b;->a:Lqd/q;

    new-instance v1, Lsd/a;

    invoke-direct {v1, p0, p1}, Lsd/a;-><init>(Lsd/b;Landroid/app/Activity;)V

    invoke-virtual {v0, v1}, Lqd/q;->i(Lcom/google/firebase/inappmessaging/FirebaseInAppMessagingDisplay;)V

    invoke-virtual {p1}, Landroid/app/Activity;->getLocalClassName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lsd/b;->x:Ljava/lang/String;

    :cond_1
    iget-object v0, p0, Lsd/b;->v:Lde/i;

    if-eqz v0, :cond_2

    invoke-direct {p0, p1}, Lsd/b;->G(Landroid/app/Activity;)V

    :cond_2
    return-void
.end method

.method private r()V
    .locals 1

    iget-object v0, p0, Lsd/b;->d:Lud/n;

    invoke-virtual {v0}, Lud/n;->a()V

    iget-object v0, p0, Lsd/b;->e:Lud/n;

    invoke-virtual {v0}, Lud/n;->a()V

    return-void
.end method

.method private s(Landroid/app/Activity;)V
    .locals 1

    const-string v0, "Dismissing fiam"

    invoke-static {v0}, Lud/m;->a(Ljava/lang/String;)V

    invoke-direct {p0}, Lsd/b;->D()V

    invoke-direct {p0, p1}, Lsd/b;->F(Landroid/app/Activity;)V

    const/4 p1, 0x0

    iput-object p1, p0, Lsd/b;->v:Lde/i;

    iput-object p1, p0, Lsd/b;->w:Lqd/t;

    return-void
.end method

.method private t(Lde/i;)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lde/i;",
            ")",
            "Ljava/util/List<",
            "Lde/a;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sget-object v1, Lsd/b$e;->a:[I

    invoke-virtual {p1}, Lde/i;->c()Lcom/google/firebase/inappmessaging/model/MessageType;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v1, v1, v2

    const/4 v2, 0x1

    if-eq v1, v2, :cond_3

    const/4 v2, 0x2

    if-eq v1, v2, :cond_2

    const/4 v2, 0x3

    if-eq v1, v2, :cond_1

    const/4 v2, 0x4

    if-eq v1, v2, :cond_0

    invoke-static {}, Lde/a;->a()Lde/a$b;

    move-result-object p1

    invoke-virtual {p1}, Lde/a$b;->a()Lde/a;

    move-result-object p1

    goto :goto_0

    :cond_0
    check-cast p1, Lde/f;

    invoke-virtual {p1}, Lde/f;->i()Lde/a;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {p1}, Lde/f;->j()Lde/a;

    move-result-object p1

    goto :goto_0

    :cond_1
    check-cast p1, Lde/h;

    invoke-virtual {p1}, Lde/h;->e()Lde/a;

    move-result-object p1

    goto :goto_0

    :cond_2
    check-cast p1, Lde/j;

    invoke-virtual {p1}, Lde/j;->e()Lde/a;

    move-result-object p1

    goto :goto_0

    :cond_3
    check-cast p1, Lde/c;

    invoke-virtual {p1}, Lde/c;->e()Lde/a;

    move-result-object p1

    :goto_0
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object v0
.end method

.method private u(Lde/i;)Lde/g;
    .locals 3

    invoke-virtual {p1}, Lde/i;->c()Lcom/google/firebase/inappmessaging/model/MessageType;

    move-result-object v0

    sget-object v1, Lcom/google/firebase/inappmessaging/model/MessageType;->CARD:Lcom/google/firebase/inappmessaging/model/MessageType;

    if-ne v0, v1, :cond_3

    check-cast p1, Lde/f;

    invoke-virtual {p1}, Lde/f;->h()Lde/g;

    move-result-object v0

    invoke-virtual {p1}, Lde/f;->g()Lde/g;

    move-result-object p1

    iget-object v1, p0, Lsd/b;->s:Landroid/app/Application;

    invoke-static {v1}, Lsd/b;->v(Landroid/app/Application;)I

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_1

    invoke-direct {p0, v0}, Lsd/b;->x(Lde/g;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    move-object v0, p1

    :goto_0
    return-object v0

    :cond_1
    invoke-direct {p0, p1}, Lsd/b;->x(Lde/g;)Z

    move-result v1

    if-eqz v1, :cond_2

    move-object v0, p1

    :cond_2
    return-object v0

    :cond_3
    invoke-virtual {p1}, Lde/i;->b()Lde/g;

    move-result-object p1

    return-object p1
.end method

.method private static v(Landroid/app/Application;)I
    .locals 0

    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p0

    invoke-virtual {p0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object p0

    iget p0, p0, Landroid/content/res/Configuration;->orientation:I

    return p0
.end method

.method private w(Landroid/app/Activity;Lvd/c;)V
    .locals 5

    iget-object v0, p0, Lsd/b;->v:Lde/i;

    if-nez v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Lsd/b$b;

    invoke-direct {v0, p0, p1}, Lsd/b$b;-><init>(Lsd/b;Landroid/app/Activity;)V

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    iget-object v2, p0, Lsd/b;->v:Lde/i;

    invoke-direct {p0, v2}, Lsd/b;->t(Lde/i;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lde/a;

    if-eqz v3, :cond_1

    invoke-virtual {v3}, Lde/a;->b()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-nez v4, :cond_1

    new-instance v4, Lsd/b$c;

    invoke-direct {v4, p0, v3, p1}, Lsd/b$c;-><init>(Lsd/b;Lde/a;Landroid/app/Activity;)V

    goto :goto_1

    :cond_1
    const-string v4, "No action url found for action. Treating as dismiss."

    invoke-static {v4}, Lud/m;->f(Ljava/lang/String;)V

    move-object v4, v0

    :goto_1
    invoke-interface {v1, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_2
    invoke-virtual {p2, v1, v0}, Lvd/c;->g(Ljava/util/Map;Landroid/view/View$OnClickListener;)Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {p2}, Lvd/c;->e()Landroid/widget/ImageView;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    :cond_3
    iget-object v1, p0, Lsd/b;->v:Lde/i;

    invoke-direct {p0, v1}, Lsd/b;->u(Lde/i;)Lde/g;

    move-result-object v1

    new-instance v2, Lsd/b$d;

    invoke-direct {v2, p0, p2, p1, v0}, Lsd/b$d;-><init>(Lsd/b;Lvd/c;Landroid/app/Activity;Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    invoke-direct {p0, p1, p2, v1, v2}, Lsd/b;->B(Landroid/app/Activity;Lvd/c;Lde/g;Lud/e$a;)V

    return-void
.end method

.method private x(Lde/g;)Z
    .locals 0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lde/g;->b()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method private y(Landroid/net/Uri;)Z
    .locals 2

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    :cond_0
    invoke-virtual {p1}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_2

    const-string v1, "http"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_1

    const-string v1, "https"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_2

    :cond_1
    const/4 v0, 0x1

    :cond_2
    return v0
.end method

.method private synthetic z(Landroid/app/Activity;Lde/i;Lqd/t;)V
    .locals 1

    iget-object v0, p0, Lsd/b;->v:Lde/i;

    if-nez v0, :cond_1

    iget-object v0, p0, Lsd/b;->a:Lqd/q;

    invoke-virtual {v0}, Lqd/q;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iput-object p2, p0, Lsd/b;->v:Lde/i;

    iput-object p3, p0, Lsd/b;->w:Lqd/t;

    invoke-direct {p0, p1}, Lsd/b;->G(Landroid/app/Activity;)V

    return-void

    :cond_1
    :goto_0
    const-string p1, "Active FIAM exists. Skipping trigger"

    invoke-static {p1}, Lud/m;->a(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public onActivityPaused(Landroid/app/Activity;)V
    .locals 1

    invoke-direct {p0, p1}, Lsd/b;->I(Landroid/app/Activity;)V

    iget-object v0, p0, Lsd/b;->a:Lqd/q;

    invoke-virtual {v0}, Lqd/q;->g()V

    invoke-super {p0, p1}, Lud/i;->onActivityPaused(Landroid/app/Activity;)V

    return-void
.end method

.method public onActivityResumed(Landroid/app/Activity;)V
    .locals 0

    invoke-super {p0, p1}, Lud/i;->onActivityResumed(Landroid/app/Activity;)V

    invoke-direct {p0, p1}, Lsd/b;->q(Landroid/app/Activity;)V

    return-void
.end method
