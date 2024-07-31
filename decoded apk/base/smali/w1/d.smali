.class public final Lw1/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv1/j;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lw1/d$c;,
        Lw1/d$a;,
        Lw1/d$b;
    }
.end annotation


# static fields
.field public static final s:Lw1/d$a;


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Ljava/lang/String;

.field private final c:Lv1/j$a;

.field private final d:Z

.field private final e:Z

.field private final f:Lck/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lck/h<",
            "Lw1/d$c;",
            ">;"
        }
    .end annotation
.end field

.field private r:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lw1/d$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lw1/d$a;-><init>(Lkotlin/jvm/internal/g;)V

    sput-object v0, Lw1/d;->s:Lw1/d$a;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Lv1/j$a;ZZ)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callback"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw1/d;->a:Landroid/content/Context;

    iput-object p2, p0, Lw1/d;->b:Ljava/lang/String;

    iput-object p3, p0, Lw1/d;->c:Lv1/j$a;

    iput-boolean p4, p0, Lw1/d;->d:Z

    iput-boolean p5, p0, Lw1/d;->e:Z

    new-instance p1, Lw1/d$d;

    invoke-direct {p1, p0}, Lw1/d$d;-><init>(Lw1/d;)V

    invoke-static {p1}, Lck/i;->a(Lok/a;)Lck/h;

    move-result-object p1

    iput-object p1, p0, Lw1/d;->f:Lck/h;

    return-void
.end method

.method public static final synthetic a(Lw1/d;)Z
    .locals 0

    iget-boolean p0, p0, Lw1/d;->e:Z

    return p0
.end method

.method public static final synthetic b(Lw1/d;)Lv1/j$a;
    .locals 0

    iget-object p0, p0, Lw1/d;->c:Lv1/j$a;

    return-object p0
.end method

.method public static final synthetic e(Lw1/d;)Landroid/content/Context;
    .locals 0

    iget-object p0, p0, Lw1/d;->a:Landroid/content/Context;

    return-object p0
.end method

.method public static final synthetic f(Lw1/d;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lw1/d;->b:Ljava/lang/String;

    return-object p0
.end method

.method public static final synthetic g(Lw1/d;)Z
    .locals 0

    iget-boolean p0, p0, Lw1/d;->d:Z

    return p0
.end method

.method public static final synthetic i(Lw1/d;)Z
    .locals 0

    iget-boolean p0, p0, Lw1/d;->r:Z

    return p0
.end method

.method private final j()Lw1/d$c;
    .locals 1

    iget-object v0, p0, Lw1/d;->f:Lck/h;

    invoke-interface {v0}, Lck/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lw1/d$c;

    return-object v0
.end method


# virtual methods
.method public Q0()Lv1/i;
    .locals 2

    invoke-direct {p0}, Lw1/d;->j()Lw1/d$c;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lw1/d$c;->e(Z)Lv1/i;

    move-result-object v0

    return-object v0
.end method

.method public close()V
    .locals 1

    iget-object v0, p0, Lw1/d;->f:Lck/h;

    invoke-interface {v0}, Lck/h;->isInitialized()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lw1/d;->j()Lw1/d$c;

    move-result-object v0

    invoke-virtual {v0}, Lw1/d$c;->close()V

    :cond_0
    return-void
.end method

.method public getDatabaseName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lw1/d;->b:Ljava/lang/String;

    return-object v0
.end method

.method public setWriteAheadLoggingEnabled(Z)V
    .locals 1

    iget-object v0, p0, Lw1/d;->f:Lck/h;

    invoke-interface {v0}, Lck/h;->isInitialized()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lw1/d;->j()Lw1/d$c;

    move-result-object v0

    invoke-static {v0, p1}, Lv1/b;->d(Landroid/database/sqlite/SQLiteOpenHelper;Z)V

    :cond_0
    iput-boolean p1, p0, Lw1/d;->r:Z

    return-void
.end method
