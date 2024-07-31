.class public Lna/e;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final b:Lna/e;


# instance fields
.field private a:Lna/d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lna/e;

    invoke-direct {v0}, Lna/e;-><init>()V

    sput-object v0, Lna/e;->b:Lna/e;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lna/e;->a:Lna/d;

    return-void
.end method

.method public static a(Landroid/content/Context;)Lna/d;
    .locals 1

    sget-object v0, Lna/e;->b:Lna/e;

    invoke-virtual {v0, p0}, Lna/e;->b(Landroid/content/Context;)Lna/d;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final declared-synchronized b(Landroid/content/Context;)Lna/d;
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lna/e;->a:Lna/d;

    if-nez v0, :cond_1

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    :cond_0
    new-instance v0, Lna/d;

    invoke-direct {v0, p1}, Lna/d;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lna/e;->a:Lna/d;

    :cond_1
    iget-object p1, p0, Lna/e;->a:Lna/d;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method
