.class final Lcom/google/android/gms/internal/consent_sdk/zzba;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcb/f$b;
.implements Lcb/f$a;


# instance fields
.field private final zza:Lcb/f$b;

.field private final zzb:Lcb/f$a;


# direct methods
.method synthetic constructor <init>(Lcb/f$b;Lcb/f$a;Lcom/google/android/gms/internal/consent_sdk/zzaz;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/consent_sdk/zzba;->zza:Lcb/f$b;

    iput-object p2, p0, Lcom/google/android/gms/internal/consent_sdk/zzba;->zzb:Lcb/f$a;

    return-void
.end method


# virtual methods
.method public final onConsentFormLoadFailure(Lcb/e;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/consent_sdk/zzba;->zzb:Lcb/f$a;

    invoke-interface {v0, p1}, Lcb/f$a;->onConsentFormLoadFailure(Lcb/e;)V

    return-void
.end method

.method public final onConsentFormLoadSuccess(Lcb/b;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/consent_sdk/zzba;->zza:Lcb/f$b;

    invoke-interface {v0, p1}, Lcb/f$b;->onConsentFormLoadSuccess(Lcb/b;)V

    return-void
.end method
