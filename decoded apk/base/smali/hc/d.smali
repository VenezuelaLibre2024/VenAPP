.class public final synthetic Lhc/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/tasks/Continuation;


# instance fields
.field public final synthetic a:Lhc/j;

.field public final synthetic b:Z


# direct methods
.method public synthetic constructor <init>(Lhc/j;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lhc/d;->a:Lhc/j;

    iput-boolean p2, p0, Lhc/d;->b:Z

    return-void
.end method


# virtual methods
.method public final then(Lcom/google/android/gms/tasks/Task;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lhc/d;->a:Lhc/j;

    iget-boolean v1, p0, Lhc/d;->b:Z

    invoke-static {v0, v1, p1}, Lhc/j;->j(Lhc/j;ZLcom/google/android/gms/tasks/Task;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method
