.class Ll2/c$c;
.super Ll2/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ll2/c;->c(Ljava/lang/String;Landroidx/work/impl/e0;Z)Ll2/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Landroidx/work/impl/e0;

.field final synthetic c:Ljava/lang/String;

.field final synthetic d:Z


# direct methods
.method constructor <init>(Landroidx/work/impl/e0;Ljava/lang/String;Z)V
    .locals 0

    iput-object p1, p0, Ll2/c$c;->b:Landroidx/work/impl/e0;

    iput-object p2, p0, Ll2/c$c;->c:Ljava/lang/String;

    iput-boolean p3, p0, Ll2/c$c;->d:Z

    invoke-direct {p0}, Ll2/c;-><init>()V

    return-void
.end method


# virtual methods
.method h()V
    .locals 4

    iget-object v0, p0, Ll2/c$c;->b:Landroidx/work/impl/e0;

    invoke-virtual {v0}, Landroidx/work/impl/e0;->r()Landroidx/work/impl/WorkDatabase;

    move-result-object v0

    invoke-virtual {v0}, Lr1/u;->e()V

    :try_start_0
    invoke-virtual {v0}, Landroidx/work/impl/WorkDatabase;->J()Lk2/v;

    move-result-object v1

    iget-object v2, p0, Ll2/c$c;->c:Ljava/lang/String;

    invoke-interface {v1, v2}, Lk2/v;->f(Ljava/lang/String;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    iget-object v3, p0, Ll2/c$c;->b:Landroidx/work/impl/e0;

    invoke-virtual {p0, v3, v2}, Ll2/c;->a(Landroidx/work/impl/e0;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lr1/u;->B()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v0}, Lr1/u;->i()V

    iget-boolean v0, p0, Ll2/c$c;->d:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Ll2/c$c;->b:Landroidx/work/impl/e0;

    invoke-virtual {p0, v0}, Ll2/c;->g(Landroidx/work/impl/e0;)V

    :cond_1
    return-void

    :catchall_0
    move-exception v1

    invoke-virtual {v0}, Lr1/u;->i()V

    throw v1
.end method
