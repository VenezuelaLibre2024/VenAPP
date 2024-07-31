.class public final Lqb/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lqb/a$b;
    }
.end annotation


# static fields
.field private static final d:Ljava/lang/Object;

.field private static final e:Ljava/lang/String; = "a"


# instance fields
.field private final a:Ljb/q;

.field private final b:Ljb/a;

.field private c:Ljb/o;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lqb/a;->d:Ljava/lang/Object;

    return-void
.end method

.method private constructor <init>(Lqb/a$b;)V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lqb/d;

    invoke-static {p1}, Lqb/a$b;->a(Lqb/a$b;)Landroid/content/Context;

    move-result-object v1

    invoke-static {p1}, Lqb/a$b;->b(Lqb/a$b;)Ljava/lang/String;

    move-result-object v2

    invoke-static {p1}, Lqb/a$b;->c(Lqb/a$b;)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v0, v1, v2, v3}, Lqb/d;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    iput-object v0, p0, Lqb/a;->a:Ljb/q;

    invoke-static {p1}, Lqb/a$b;->d(Lqb/a$b;)Ljb/a;

    move-result-object v0

    iput-object v0, p0, Lqb/a;->b:Ljb/a;

    invoke-static {p1}, Lqb/a$b;->e(Lqb/a$b;)Ljb/o;

    move-result-object p1

    iput-object p1, p0, Lqb/a;->c:Ljb/o;

    return-void
.end method

.method synthetic constructor <init>(Lqb/a$b;Lqb/a$a;)V
    .locals 0

    invoke-direct {p0, p1}, Lqb/a;-><init>(Lqb/a$b;)V

    return-void
.end method

.method static synthetic a()Ljava/lang/Object;
    .locals 1

    sget-object v0, Lqb/a;->d:Ljava/lang/Object;

    return-object v0
.end method

.method static synthetic b()Z
    .locals 1

    invoke-static {}, Lqb/a;->e()Z

    move-result v0

    return v0
.end method

.method static synthetic c()Ljava/lang/String;
    .locals 1

    sget-object v0, Lqb/a;->e:Ljava/lang/String;

    return-object v0
.end method

.method private static e()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method


# virtual methods
.method public declared-synchronized d()Ljb/n;
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lqb/a;->c:Ljb/o;

    invoke-virtual {v0}, Ljb/o;->d()Ljb/n;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method
