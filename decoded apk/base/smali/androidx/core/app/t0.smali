.class public final Landroidx/core/app/t0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/core/app/t0$f;,
        Landroidx/core/app/t0$c;,
        Landroidx/core/app/t0$a;,
        Landroidx/core/app/t0$b;,
        Landroidx/core/app/t0$e;,
        Landroidx/core/app/t0$d;
    }
.end annotation


# static fields
.field private static final c:Ljava/lang/Object;

.field private static d:Ljava/lang/String;

.field private static e:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private static final f:Ljava/lang/Object;

.field private static g:Landroidx/core/app/t0$e;


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Landroid/app/NotificationManager;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Landroidx/core/app/t0;->c:Ljava/lang/Object;

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    sput-object v0, Landroidx/core/app/t0;->e:Ljava/util/Set;

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Landroidx/core/app/t0;->f:Ljava/lang/Object;

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/core/app/t0;->a:Landroid/content/Context;

    const-string v0, "notification"

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/app/NotificationManager;

    iput-object p1, p0, Landroidx/core/app/t0;->b:Landroid/app/NotificationManager;

    return-void
.end method

.method public static f(Landroid/content/Context;)Landroidx/core/app/t0;
    .locals 1

    new-instance v0, Landroidx/core/app/t0;

    invoke-direct {v0, p0}, Landroidx/core/app/t0;-><init>(Landroid/content/Context;)V

    return-object v0
.end method

.method public static g(Landroid/content/Context;)Ljava/util/Set;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            ")",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object p0

    const-string v0, "enabled_notification_listeners"

    invoke-static {p0, v0}, Landroid/provider/Settings$Secure;->getString(Landroid/content/ContentResolver;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    sget-object v0, Landroidx/core/app/t0;->c:Ljava/lang/Object;

    monitor-enter v0

    if-eqz p0, :cond_2

    :try_start_0
    sget-object v1, Landroidx/core/app/t0;->d:Ljava/lang/String;

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    const-string v1, ":"

    const/4 v2, -0x1

    invoke-virtual {p0, v1, v2}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/util/HashSet;

    array-length v3, v1

    invoke-direct {v2, v3}, Ljava/util/HashSet;-><init>(I)V

    array-length v3, v1

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v3, :cond_1

    aget-object v5, v1, v4

    invoke-static {v5}, Landroid/content/ComponentName;->unflattenFromString(Ljava/lang/String;)Landroid/content/ComponentName;

    move-result-object v5

    if-eqz v5, :cond_0

    invoke-virtual {v5}, Landroid/content/ComponentName;->getPackageName()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v2, v5}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    :cond_0
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_1
    sput-object v2, Landroidx/core/app/t0;->e:Ljava/util/Set;

    sput-object p0, Landroidx/core/app/t0;->d:Ljava/lang/String;

    :cond_2
    sget-object p0, Landroidx/core/app/t0;->e:Ljava/util/Set;

    monitor-exit v0

    return-object p0

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method private k(Landroidx/core/app/t0$f;)V
    .locals 3

    sget-object v0, Landroidx/core/app/t0;->f:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    sget-object v1, Landroidx/core/app/t0;->g:Landroidx/core/app/t0$e;

    if-nez v1, :cond_0

    new-instance v1, Landroidx/core/app/t0$e;

    iget-object v2, p0, Landroidx/core/app/t0;->a:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v1, v2}, Landroidx/core/app/t0$e;-><init>(Landroid/content/Context;)V

    sput-object v1, Landroidx/core/app/t0;->g:Landroidx/core/app/t0$e;

    :cond_0
    sget-object v1, Landroidx/core/app/t0;->g:Landroidx/core/app/t0$e;

    invoke-virtual {v1, p1}, Landroidx/core/app/t0$e;->h(Landroidx/core/app/t0$f;)V

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method private static l(Landroid/app/Notification;)Z
    .locals 1

    invoke-static {p0}, Landroidx/core/app/o;->a(Landroid/app/Notification;)Landroid/os/Bundle;

    move-result-object p0

    if-eqz p0, :cond_0

    const-string v0, "android.support.useSideChannel"

    invoke-virtual {p0, v0}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method


# virtual methods
.method public a()Z
    .locals 1

    iget-object v0, p0, Landroidx/core/app/t0;->b:Landroid/app/NotificationManager;

    invoke-static {v0}, Landroidx/core/app/t0$a;->a(Landroid/app/NotificationManager;)Z

    move-result v0

    return v0
.end method

.method public b(I)V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0, p1}, Landroidx/core/app/t0;->c(Ljava/lang/String;I)V

    return-void
.end method

.method public c(Ljava/lang/String;I)V
    .locals 1

    iget-object v0, p0, Landroidx/core/app/t0;->b:Landroid/app/NotificationManager;

    invoke-virtual {v0, p1, p2}, Landroid/app/NotificationManager;->cancel(Ljava/lang/String;I)V

    return-void
.end method

.method public d()V
    .locals 1

    iget-object v0, p0, Landroidx/core/app/t0;->b:Landroid/app/NotificationManager;

    invoke-virtual {v0}, Landroid/app/NotificationManager;->cancelAll()V

    return-void
.end method

.method public e(Landroid/app/NotificationChannel;)V
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1a

    if-lt v0, v1, :cond_0

    iget-object v0, p0, Landroidx/core/app/t0;->b:Landroid/app/NotificationManager;

    invoke-static {v0, p1}, Landroidx/core/app/t0$b;->a(Landroid/app/NotificationManager;Landroid/app/NotificationChannel;)V

    :cond_0
    return-void
.end method

.method public h()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Landroid/app/NotificationChannel;",
            ">;"
        }
    .end annotation

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1a

    if-lt v0, v1, :cond_0

    iget-object v0, p0, Landroidx/core/app/t0;->b:Landroid/app/NotificationManager;

    invoke-static {v0}, Landroidx/core/app/t0$b;->k(Landroid/app/NotificationManager;)Ljava/util/List;

    move-result-object v0

    return-object v0

    :cond_0
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public i(ILandroid/app/Notification;)V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0, p1, p2}, Landroidx/core/app/t0;->j(Ljava/lang/String;ILandroid/app/Notification;)V

    return-void
.end method

.method public j(Ljava/lang/String;ILandroid/app/Notification;)V
    .locals 2

    invoke-static {p3}, Landroidx/core/app/t0;->l(Landroid/app/Notification;)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Landroidx/core/app/t0$c;

    iget-object v1, p0, Landroidx/core/app/t0;->a:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, p2, p1, p3}, Landroidx/core/app/t0$c;-><init>(Ljava/lang/String;ILjava/lang/String;Landroid/app/Notification;)V

    invoke-direct {p0, v0}, Landroidx/core/app/t0;->k(Landroidx/core/app/t0$f;)V

    iget-object p3, p0, Landroidx/core/app/t0;->b:Landroid/app/NotificationManager;

    invoke-virtual {p3, p1, p2}, Landroid/app/NotificationManager;->cancel(Ljava/lang/String;I)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Landroidx/core/app/t0;->b:Landroid/app/NotificationManager;

    invoke-virtual {v0, p1, p2, p3}, Landroid/app/NotificationManager;->notify(Ljava/lang/String;ILandroid/app/Notification;)V

    :goto_0
    return-void
.end method
