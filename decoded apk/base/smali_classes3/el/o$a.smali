.class final Lel/o$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lel/o;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "a"
.end annotation


# instance fields
.field private a:Ljava/lang/Runnable;

.field final synthetic b:Lel/o;


# direct methods
.method public constructor <init>(Lel/o;Ljava/lang/Runnable;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Runnable;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lel/o$a;->b:Lel/o;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lel/o$a;->a:Ljava/lang/Runnable;

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    const/4 v0, 0x0

    :cond_0
    :try_start_0
    iget-object v1, p0, Lel/o$a;->a:Ljava/lang/Runnable;

    invoke-interface {v1}, Ljava/lang/Runnable;->run()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v1

    sget-object v2, Lgk/g;->a:Lgk/g;

    invoke-static {v2, v1}, Lzk/j0;->a(Lgk/f;Ljava/lang/Throwable;)V

    :goto_0
    iget-object v1, p0, Lel/o$a;->b:Lel/o;

    invoke-static {v1}, Lel/o;->J0(Lel/o;)Ljava/lang/Runnable;

    move-result-object v1

    if-nez v1, :cond_1

    return-void

    :cond_1
    iput-object v1, p0, Lel/o$a;->a:Ljava/lang/Runnable;

    add-int/lit8 v0, v0, 0x1

    const/16 v1, 0x10

    if-lt v0, v1, :cond_0

    iget-object v1, p0, Lel/o$a;->b:Lel/o;

    invoke-static {v1}, Lel/o;->I0(Lel/o;)Lzk/h0;

    move-result-object v1

    iget-object v2, p0, Lel/o$a;->b:Lel/o;

    invoke-virtual {v1, v2}, Lzk/h0;->F0(Lgk/f;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v0, p0, Lel/o$a;->b:Lel/o;

    invoke-static {v0}, Lel/o;->I0(Lel/o;)Lzk/h0;

    move-result-object v0

    iget-object v1, p0, Lel/o$a;->b:Lel/o;

    invoke-virtual {v0, v1, p0}, Lzk/h0;->D0(Lgk/f;Ljava/lang/Runnable;)V

    return-void
.end method
