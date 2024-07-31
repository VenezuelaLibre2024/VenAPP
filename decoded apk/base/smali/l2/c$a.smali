.class Ll2/c$a;
.super Ll2/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ll2/c;->b(Ljava/util/UUID;Landroidx/work/impl/e0;)Ll2/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Landroidx/work/impl/e0;

.field final synthetic c:Ljava/util/UUID;


# direct methods
.method constructor <init>(Landroidx/work/impl/e0;Ljava/util/UUID;)V
    .locals 0

    iput-object p1, p0, Ll2/c$a;->b:Landroidx/work/impl/e0;

    iput-object p2, p0, Ll2/c$a;->c:Ljava/util/UUID;

    invoke-direct {p0}, Ll2/c;-><init>()V

    return-void
.end method


# virtual methods
.method h()V
    .locals 3

    iget-object v0, p0, Ll2/c$a;->b:Landroidx/work/impl/e0;

    invoke-virtual {v0}, Landroidx/work/impl/e0;->r()Landroidx/work/impl/WorkDatabase;

    move-result-object v0

    invoke-virtual {v0}, Lr1/u;->e()V

    :try_start_0
    iget-object v1, p0, Ll2/c$a;->b:Landroidx/work/impl/e0;

    iget-object v2, p0, Ll2/c$a;->c:Ljava/util/UUID;

    invoke-virtual {v2}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v1, v2}, Ll2/c;->a(Landroidx/work/impl/e0;Ljava/lang/String;)V

    invoke-virtual {v0}, Lr1/u;->B()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v0}, Lr1/u;->i()V

    iget-object v0, p0, Ll2/c$a;->b:Landroidx/work/impl/e0;

    invoke-virtual {p0, v0}, Ll2/c;->g(Landroidx/work/impl/e0;)V

    return-void

    :catchall_0
    move-exception v1

    invoke-virtual {v0}, Lr1/u;->i()V

    throw v1
.end method
