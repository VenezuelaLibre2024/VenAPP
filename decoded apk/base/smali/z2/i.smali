.class public final synthetic Lz2/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/tasks/OnSuccessListener;


# instance fields
.field public final synthetic a:Lz2/k;


# direct methods
.method public synthetic constructor <init>(Lz2/k;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz2/i;->a:Lz2/k;

    return-void
.end method


# virtual methods
.method public final onSuccess(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lz2/i;->a:Lz2/k;

    check-cast p1, Lcom/google/android/gms/location/q;

    invoke-static {v0, p1}, Lz2/k;->g(Lz2/k;Lcom/google/android/gms/location/q;)V

    return-void
.end method
