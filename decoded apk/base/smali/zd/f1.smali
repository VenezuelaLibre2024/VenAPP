.class public final synthetic Lzd/f1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldj/m;


# instance fields
.field public final synthetic a:Lcom/google/android/gms/tasks/Task;

.field public final synthetic b:Ljava/util/concurrent/Executor;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/tasks/Task;Ljava/util/concurrent/Executor;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzd/f1;->a:Lcom/google/android/gms/tasks/Task;

    iput-object p2, p0, Lzd/f1;->b:Ljava/util/concurrent/Executor;

    return-void
.end method


# virtual methods
.method public final a(Ldj/k;)V
    .locals 2

    iget-object v0, p0, Lzd/f1;->a:Lcom/google/android/gms/tasks/Task;

    iget-object v1, p0, Lzd/f1;->b:Ljava/util/concurrent/Executor;

    invoke-static {v0, v1, p1}, Lzd/i2;->w(Lcom/google/android/gms/tasks/Task;Ljava/util/concurrent/Executor;Ldj/k;)V

    return-void
.end method
