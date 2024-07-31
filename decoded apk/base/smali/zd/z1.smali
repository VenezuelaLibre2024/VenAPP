.class public final synthetic Lzd/z1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/tasks/OnSuccessListener;


# instance fields
.field public final synthetic a:Ldj/k;


# direct methods
.method public synthetic constructor <init>(Ldj/k;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzd/z1;->a:Ldj/k;

    return-void
.end method


# virtual methods
.method public final onSuccess(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lzd/z1;->a:Ldj/k;

    invoke-static {v0, p1}, Lzd/i2;->G(Ldj/k;Ljava/lang/Object;)V

    return-void
.end method
