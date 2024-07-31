.class La0/h$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = La0/h;->d(Ljava/util/concurrent/Executor;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:I

.field final synthetic b:Lcom/google/common/util/concurrent/f;

.field final synthetic c:La0/h;


# direct methods
.method constructor <init>(La0/h;ILcom/google/common/util/concurrent/f;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, La0/h$c;->c:La0/h;

    iput p2, p0, La0/h$c;->a:I

    iput-object p3, p0, La0/h$c;->b:Lcom/google/common/util/concurrent/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, La0/h$c;->c:La0/h;

    iget v1, p0, La0/h$c;->a:I

    iget-object v2, p0, La0/h$c;->b:Lcom/google/common/util/concurrent/f;

    invoke-virtual {v0, v1, v2}, La0/h;->e(ILjava/util/concurrent/Future;)V

    return-void
.end method
