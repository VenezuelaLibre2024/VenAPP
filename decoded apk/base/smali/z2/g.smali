.class public final synthetic Lz2/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/tasks/OnSuccessListener;


# instance fields
.field public final synthetic a:Lz2/e0;


# direct methods
.method public synthetic constructor <init>(Lz2/e0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz2/g;->a:Lz2/e0;

    return-void
.end method


# virtual methods
.method public final onSuccess(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lz2/g;->a:Lz2/e0;

    check-cast p1, Landroid/location/Location;

    invoke-interface {v0, p1}, Lz2/e0;->a(Landroid/location/Location;)V

    return-void
.end method
