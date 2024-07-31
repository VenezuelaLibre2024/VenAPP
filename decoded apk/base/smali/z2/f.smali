.class public final synthetic Lz2/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/tasks/OnCompleteListener;


# instance fields
.field public final synthetic a:Lz2/a0;


# direct methods
.method public synthetic constructor <init>(Lz2/a0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz2/f;->a:Lz2/a0;

    return-void
.end method


# virtual methods
.method public final onComplete(Lcom/google/android/gms/tasks/Task;)V
    .locals 1

    iget-object v0, p0, Lz2/f;->a:Lz2/a0;

    invoke-static {v0, p1}, Lz2/k;->j(Lz2/a0;Lcom/google/android/gms/tasks/Task;)V

    return-void
.end method
