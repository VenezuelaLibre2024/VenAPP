.class public final synthetic Loi/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Loi/s;

.field public final synthetic b:Lcom/google/common/util/concurrent/f;

.field public final synthetic c:Lok/l;

.field public final synthetic d:Landroid/util/Size;

.field public final synthetic e:Z

.field public final synthetic f:Lw/p;

.field public final synthetic r:Lok/l;

.field public final synthetic s:Ljava/util/concurrent/Executor;

.field public final synthetic t:Z

.field public final synthetic u:Lok/l;

.field public final synthetic v:Lok/l;


# direct methods
.method public synthetic constructor <init>(Loi/s;Lcom/google/common/util/concurrent/f;Lok/l;Landroid/util/Size;ZLw/p;Lok/l;Ljava/util/concurrent/Executor;ZLok/l;Lok/l;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Loi/j;->a:Loi/s;

    iput-object p2, p0, Loi/j;->b:Lcom/google/common/util/concurrent/f;

    iput-object p3, p0, Loi/j;->c:Lok/l;

    iput-object p4, p0, Loi/j;->d:Landroid/util/Size;

    iput-boolean p5, p0, Loi/j;->e:Z

    iput-object p6, p0, Loi/j;->f:Lw/p;

    iput-object p7, p0, Loi/j;->r:Lok/l;

    iput-object p8, p0, Loi/j;->s:Ljava/util/concurrent/Executor;

    iput-boolean p9, p0, Loi/j;->t:Z

    iput-object p10, p0, Loi/j;->u:Lok/l;

    iput-object p11, p0, Loi/j;->v:Lok/l;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 11

    iget-object v0, p0, Loi/j;->a:Loi/s;

    iget-object v1, p0, Loi/j;->b:Lcom/google/common/util/concurrent/f;

    iget-object v2, p0, Loi/j;->c:Lok/l;

    iget-object v3, p0, Loi/j;->d:Landroid/util/Size;

    iget-boolean v4, p0, Loi/j;->e:Z

    iget-object v5, p0, Loi/j;->f:Lw/p;

    iget-object v6, p0, Loi/j;->r:Lok/l;

    iget-object v7, p0, Loi/j;->s:Ljava/util/concurrent/Executor;

    iget-boolean v8, p0, Loi/j;->t:Z

    iget-object v9, p0, Loi/j;->u:Lok/l;

    iget-object v10, p0, Loi/j;->v:Lok/l;

    invoke-static/range {v0 .. v10}, Loi/s;->i(Loi/s;Lcom/google/common/util/concurrent/f;Lok/l;Landroid/util/Size;ZLw/p;Lok/l;Ljava/util/concurrent/Executor;ZLok/l;Lok/l;)V

    return-void
.end method
