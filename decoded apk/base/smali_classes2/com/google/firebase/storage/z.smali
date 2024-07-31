.class public final synthetic Lcom/google/firebase/storage/z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/firebase/storage/l0$a;


# instance fields
.field public final synthetic a:Lcom/google/firebase/storage/e0;


# direct methods
.method public synthetic constructor <init>(Lcom/google/firebase/storage/e0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/firebase/storage/z;->a:Lcom/google/firebase/storage/e0;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/storage/z;->a:Lcom/google/firebase/storage/e0;

    check-cast p1, Lcom/google/android/gms/tasks/OnCompleteListener;

    check-cast p2, Lcom/google/firebase/storage/e0$a;

    invoke-static {v0, p1, p2}, Lcom/google/firebase/storage/e0;->b(Lcom/google/firebase/storage/e0;Lcom/google/android/gms/tasks/OnCompleteListener;Lcom/google/firebase/storage/e0$a;)V

    return-void
.end method
