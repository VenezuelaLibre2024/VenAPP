.class public Ll2/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final a:Landroidx/work/impl/e0;

.field private final b:Landroidx/work/impl/o;


# direct methods
.method public constructor <init>(Landroidx/work/impl/e0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll2/t;->a:Landroidx/work/impl/e0;

    new-instance p1, Landroidx/work/impl/o;

    invoke-direct {p1}, Landroidx/work/impl/o;-><init>()V

    iput-object p1, p0, Ll2/t;->b:Landroidx/work/impl/o;

    return-void
.end method


# virtual methods
.method public a()Lf2/m;
    .locals 1

    iget-object v0, p0, Ll2/t;->b:Landroidx/work/impl/o;

    return-object v0
.end method

.method public run()V
    .locals 3

    :try_start_0
    iget-object v0, p0, Ll2/t;->a:Landroidx/work/impl/e0;

    invoke-virtual {v0}, Landroidx/work/impl/e0;->r()Landroidx/work/impl/WorkDatabase;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/work/impl/WorkDatabase;->J()Lk2/v;

    move-result-object v0

    invoke-interface {v0}, Lk2/v;->b()V

    iget-object v0, p0, Ll2/t;->b:Landroidx/work/impl/o;

    sget-object v1, Lf2/m;->a:Lf2/m$b$c;

    invoke-virtual {v0, v1}, Landroidx/work/impl/o;->a(Lf2/m$b;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    iget-object v1, p0, Ll2/t;->b:Landroidx/work/impl/o;

    new-instance v2, Lf2/m$b$a;

    invoke-direct {v2, v0}, Lf2/m$b$a;-><init>(Ljava/lang/Throwable;)V

    invoke-virtual {v1, v2}, Landroidx/work/impl/o;->a(Lf2/m$b;)V

    :goto_0
    return-void
.end method
