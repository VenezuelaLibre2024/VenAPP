.class public final Lcom/google/android/gms/measurement/AppMeasurementReceiver;
.super Lg1/a;
.source "SourceFile"

# interfaces
.implements Lwa/n$a;


# instance fields
.field private c:Lwa/n;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lg1/a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 0

    invoke-static {p1, p2}, Lg1/a;->c(Landroid/content/Context;Landroid/content/Intent;)Landroid/content/ComponentName;

    return-void
.end method

.method public final onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/measurement/AppMeasurementReceiver;->c:Lwa/n;

    if-nez v0, :cond_0

    new-instance v0, Lwa/n;

    invoke-direct {v0, p0}, Lwa/n;-><init>(Lwa/n$a;)V

    iput-object v0, p0, Lcom/google/android/gms/measurement/AppMeasurementReceiver;->c:Lwa/n;

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/measurement/AppMeasurementReceiver;->c:Lwa/n;

    invoke-virtual {v0, p1, p2}, Lwa/n;->a(Landroid/content/Context;Landroid/content/Intent;)V

    return-void
.end method
