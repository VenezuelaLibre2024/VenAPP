.class public final synthetic Lcom/google/android/gms/internal/consent_sdk/zzbm;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcb/f$a;


# instance fields
.field public final synthetic zza:Lcb/b$a;


# direct methods
.method public synthetic constructor <init>(Lcb/b$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/consent_sdk/zzbm;->zza:Lcb/b$a;

    return-void
.end method


# virtual methods
.method public final onConsentFormLoadFailure(Lcb/e;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/consent_sdk/zzbm;->zza:Lcb/b$a;

    invoke-interface {v0, p1}, Lcb/b$a;->onConsentFormDismissed(Lcb/e;)V

    return-void
.end method
