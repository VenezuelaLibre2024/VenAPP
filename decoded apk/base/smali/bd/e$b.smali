.class final Lbd/e$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lbd/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "b"
.end annotation


# instance fields
.field private final a:Lvc/u;

.field private final b:Lcom/google/android/gms/tasks/TaskCompletionSource;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/tasks/TaskCompletionSource<",
            "Lvc/u;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic c:Lbd/e;


# direct methods
.method private constructor <init>(Lbd/e;Lvc/u;Lcom/google/android/gms/tasks/TaskCompletionSource;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lvc/u;",
            "Lcom/google/android/gms/tasks/TaskCompletionSource<",
            "Lvc/u;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lbd/e$b;->c:Lbd/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lbd/e$b;->a:Lvc/u;

    iput-object p3, p0, Lbd/e$b;->b:Lcom/google/android/gms/tasks/TaskCompletionSource;

    return-void
.end method

.method synthetic constructor <init>(Lbd/e;Lvc/u;Lcom/google/android/gms/tasks/TaskCompletionSource;Lbd/e$a;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lbd/e$b;-><init>(Lbd/e;Lvc/u;Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 8

    iget-object v0, p0, Lbd/e$b;->c:Lbd/e;

    iget-object v1, p0, Lbd/e$b;->a:Lvc/u;

    iget-object v2, p0, Lbd/e$b;->b:Lcom/google/android/gms/tasks/TaskCompletionSource;

    invoke-static {v0, v1, v2}, Lbd/e;->c(Lbd/e;Lvc/u;Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    iget-object v0, p0, Lbd/e$b;->c:Lbd/e;

    invoke-static {v0}, Lbd/e;->d(Lbd/e;)Lvc/g0;

    move-result-object v0

    invoke-virtual {v0}, Lvc/g0;->e()V

    iget-object v0, p0, Lbd/e$b;->c:Lbd/e;

    invoke-static {v0}, Lbd/e;->e(Lbd/e;)D

    move-result-wide v0

    invoke-static {}, Lsc/g;->f()Lsc/g;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Delay for: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v4, Ljava/util/Locale;->US:Ljava/util/Locale;

    const/4 v5, 0x1

    new-array v5, v5, [Ljava/lang/Object;

    const-wide v6, 0x408f400000000000L    # 1000.0

    div-double v6, v0, v6

    invoke-static {v6, v7}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v6

    const/4 v7, 0x0

    aput-object v6, v5, v7

    const-string v6, "%.2f"

    invoke-static {v4, v6, v5}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, " s for report: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, p0, Lbd/e$b;->a:Lvc/u;

    invoke-virtual {v4}, Lvc/u;->d()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lsc/g;->b(Ljava/lang/String;)V

    invoke-static {v0, v1}, Lbd/e;->f(D)V

    return-void
.end method
