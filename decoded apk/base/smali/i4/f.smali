.class public final synthetic Li4/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Li4/m0$a;


# instance fields
.field public final synthetic a:Li4/g$d;

.field public final synthetic b:Li4/a;

.field public final synthetic c:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final synthetic d:Ljava/util/Set;

.field public final synthetic e:Ljava/util/Set;

.field public final synthetic f:Ljava/util/Set;

.field public final synthetic g:Li4/g;


# direct methods
.method public synthetic constructor <init>(Li4/g$d;Li4/a;Li4/a$a;Ljava/util/concurrent/atomic/AtomicBoolean;Ljava/util/Set;Ljava/util/Set;Ljava/util/Set;Li4/g;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li4/f;->a:Li4/g$d;

    iput-object p2, p0, Li4/f;->b:Li4/a;

    iput-object p4, p0, Li4/f;->c:Ljava/util/concurrent/atomic/AtomicBoolean;

    iput-object p5, p0, Li4/f;->d:Ljava/util/Set;

    iput-object p6, p0, Li4/f;->e:Ljava/util/Set;

    iput-object p7, p0, Li4/f;->f:Ljava/util/Set;

    iput-object p8, p0, Li4/f;->g:Li4/g;

    return-void
.end method


# virtual methods
.method public final b(Li4/m0;)V
    .locals 9

    iget-object v0, p0, Li4/f;->a:Li4/g$d;

    iget-object v1, p0, Li4/f;->b:Li4/a;

    const/4 v2, 0x0

    iget-object v3, p0, Li4/f;->c:Ljava/util/concurrent/atomic/AtomicBoolean;

    iget-object v4, p0, Li4/f;->d:Ljava/util/Set;

    iget-object v5, p0, Li4/f;->e:Ljava/util/Set;

    iget-object v6, p0, Li4/f;->f:Ljava/util/Set;

    iget-object v7, p0, Li4/f;->g:Li4/g;

    move-object v8, p1

    invoke-static/range {v0 .. v8}, Li4/g;->c(Li4/g$d;Li4/a;Li4/a$a;Ljava/util/concurrent/atomic/AtomicBoolean;Ljava/util/Set;Ljava/util/Set;Ljava/util/Set;Li4/g;Li4/m0;)V

    return-void
.end method
