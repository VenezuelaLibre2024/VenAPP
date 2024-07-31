.class public final synthetic Lbd/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lf6/h;


# instance fields
.field public final synthetic a:Lbd/e;

.field public final synthetic b:Lcom/google/android/gms/tasks/TaskCompletionSource;

.field public final synthetic c:Z

.field public final synthetic d:Lvc/u;


# direct methods
.method public synthetic constructor <init>(Lbd/e;Lcom/google/android/gms/tasks/TaskCompletionSource;ZLvc/u;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbd/c;->a:Lbd/e;

    iput-object p2, p0, Lbd/c;->b:Lcom/google/android/gms/tasks/TaskCompletionSource;

    iput-boolean p3, p0, Lbd/c;->c:Z

    iput-object p4, p0, Lbd/c;->d:Lvc/u;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Exception;)V
    .locals 4

    iget-object v0, p0, Lbd/c;->a:Lbd/e;

    iget-object v1, p0, Lbd/c;->b:Lcom/google/android/gms/tasks/TaskCompletionSource;

    iget-boolean v2, p0, Lbd/c;->c:Z

    iget-object v3, p0, Lbd/c;->d:Lvc/u;

    invoke-static {v0, v1, v2, v3, p1}, Lbd/e;->a(Lbd/e;Lcom/google/android/gms/tasks/TaskCompletionSource;ZLvc/u;Ljava/lang/Exception;)V

    return-void
.end method
