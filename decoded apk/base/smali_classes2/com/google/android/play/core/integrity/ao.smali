.class public final Lcom/google/android/play/core/integrity/ao;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/play/integrity/internal/j;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a()Ljava/lang/Object;
    .locals 2

    new-instance v0, Lcom/google/android/play/integrity/internal/c0;

    const-string v1, "StandardIntegrity"

    invoke-direct {v0, v1}, Lcom/google/android/play/integrity/internal/c0;-><init>(Ljava/lang/String;)V

    return-object v0
.end method
