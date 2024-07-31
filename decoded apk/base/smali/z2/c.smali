.class public Lz2/c;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Ljava/lang/Integer;

.field private final c:Ljava/lang/String;

.field private d:Landroidx/core/app/o$e;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/Integer;Lz2/e;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz2/c;->a:Landroid/content/Context;

    iput-object p3, p0, Lz2/c;->b:Ljava/lang/Integer;

    iput-object p2, p0, Lz2/c;->c:Ljava/lang/String;

    new-instance p3, Landroidx/core/app/o$e;

    invoke-direct {p3, p1, p2}, Landroidx/core/app/o$e;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    const/4 p1, 0x1

    invoke-virtual {p3, p1}, Landroidx/core/app/o$e;->B(I)Landroidx/core/app/o$e;

    move-result-object p1

    iput-object p1, p0, Lz2/c;->d:Landroidx/core/app/o$e;

    const/4 p1, 0x0

    invoke-direct {p0, p4, p1}, Lz2/c;->e(Lz2/e;Z)V

    return-void
.end method

.method private b()Landroid/app/PendingIntent;
    .locals 4

    iget-object v0, p0, Lz2/c;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    iget-object v1, p0, Lz2/c;->a:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/content/pm/PackageManager;->getLaunchIntentForPackage(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    const/high16 v1, 0x10200000

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    iget-object v1, p0, Lz2/c;->a:Landroid/content/Context;

    const/4 v2, 0x0

    const/high16 v3, 0xc000000

    invoke-static {v1, v2, v0, v3}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v0

    return-object v0

    :cond_0
    return-object v1
.end method

.method private c(Ljava/lang/String;Ljava/lang/String;)I
    .locals 2

    iget-object v0, p0, Lz2/c;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    iget-object v1, p0, Lz2/c;->a:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, p2, v1}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result p1

    return p1
.end method

.method private e(Lz2/e;Z)V
    .locals 3

    invoke-virtual {p1}, Lz2/e;->b()Lz2/a;

    move-result-object v0

    invoke-virtual {v0}, Lz2/a;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lz2/e;->b()Lz2/a;

    move-result-object v1

    invoke-virtual {v1}, Lz2/a;->a()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lz2/c;->c(Ljava/lang/String;Ljava/lang/String;)I

    move-result v0

    if-nez v0, :cond_0

    const-string v1, "ic_launcher.png"

    const-string v2, "mipmap"

    invoke-direct {p0, v1, v2}, Lz2/c;->c(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    iget-object v1, p0, Lz2/c;->d:Landroidx/core/app/o$e;

    invoke-virtual {p1}, Lz2/e;->d()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroidx/core/app/o$e;->n(Ljava/lang/CharSequence;)Landroidx/core/app/o$e;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroidx/core/app/o$e;->F(I)Landroidx/core/app/o$e;

    move-result-object v0

    invoke-virtual {p1}, Lz2/e;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/core/app/o$e;->m(Ljava/lang/CharSequence;)Landroidx/core/app/o$e;

    move-result-object v0

    invoke-direct {p0}, Lz2/c;->b()Landroid/app/PendingIntent;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/core/app/o$e;->l(Landroid/app/PendingIntent;)Landroidx/core/app/o$e;

    move-result-object v0

    invoke-virtual {p1}, Lz2/e;->g()Z

    move-result v1

    invoke-virtual {v0, v1}, Landroidx/core/app/o$e;->z(Z)Landroidx/core/app/o$e;

    move-result-object v0

    iput-object v0, p0, Lz2/c;->d:Landroidx/core/app/o$e;

    invoke-virtual {p1}, Lz2/e;->a()Ljava/lang/Integer;

    move-result-object p1

    if-eqz p1, :cond_1

    iget-object v0, p0, Lz2/c;->d:Landroidx/core/app/o$e;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-virtual {v0, p1}, Landroidx/core/app/o$e;->j(I)Landroidx/core/app/o$e;

    move-result-object p1

    iput-object p1, p0, Lz2/c;->d:Landroidx/core/app/o$e;

    :cond_1
    if-eqz p2, :cond_2

    iget-object p1, p0, Lz2/c;->a:Landroid/content/Context;

    invoke-static {p1}, Landroidx/core/app/t0;->f(Landroid/content/Context;)Landroidx/core/app/t0;

    move-result-object p1

    iget-object p2, p0, Lz2/c;->b:Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget-object v0, p0, Lz2/c;->d:Landroidx/core/app/o$e;

    invoke-virtual {v0}, Landroidx/core/app/o$e;->c()Landroid/app/Notification;

    move-result-object v0

    invoke-virtual {p1, p2, v0}, Landroidx/core/app/t0;->i(ILandroid/app/Notification;)V

    :cond_2
    return-void
.end method


# virtual methods
.method public a()Landroid/app/Notification;
    .locals 1

    iget-object v0, p0, Lz2/c;->d:Landroidx/core/app/o$e;

    invoke-virtual {v0}, Landroidx/core/app/o$e;->c()Landroid/app/Notification;

    move-result-object v0

    return-object v0
.end method

.method public d(Ljava/lang/String;)V
    .locals 4

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1a

    if-lt v0, v1, :cond_0

    iget-object v0, p0, Lz2/c;->a:Landroid/content/Context;

    invoke-static {v0}, Landroidx/core/app/t0;->f(Landroid/content/Context;)Landroidx/core/app/t0;

    move-result-object v0

    new-instance v1, Landroid/app/NotificationChannel;

    iget-object v2, p0, Lz2/c;->c:Ljava/lang/String;

    const/4 v3, 0x0

    invoke-direct {v1, v2, p1, v3}, Landroid/app/NotificationChannel;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    invoke-static {v1, v3}, Lz2/b;->a(Landroid/app/NotificationChannel;I)V

    invoke-virtual {v0, v1}, Landroidx/core/app/t0;->e(Landroid/app/NotificationChannel;)V

    :cond_0
    return-void
.end method

.method public f(Lz2/e;Z)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lz2/c;->e(Lz2/e;Z)V

    return-void
.end method
