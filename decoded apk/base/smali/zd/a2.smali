.class public final synthetic Lzd/a2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/tasks/OnFailureListener;


# instance fields
.field public final synthetic a:Ldj/k;


# direct methods
.method public synthetic constructor <init>(Ldj/k;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzd/a2;->a:Ldj/k;

    return-void
.end method


# virtual methods
.method public final onFailure(Ljava/lang/Exception;)V
    .locals 1

    iget-object v0, p0, Lzd/a2;->a:Ldj/k;

    invoke-static {v0, p1}, Lzd/i2;->t(Ldj/k;Ljava/lang/Exception;)V

    return-void
.end method
