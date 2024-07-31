.class public Lua/x;
.super Lea/a;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lua/x;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field protected final a:Lua/b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lua/z0;

    invoke-direct {v0}, Lua/z0;-><init>()V

    sput-object v0, Lua/x;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(Landroid/os/IBinder;)V
    .locals 1

    invoke-direct {p0}, Lea/a;-><init>()V

    new-instance v0, Lua/b;

    invoke-static {p1}, Lcom/google/android/gms/dynamic/b$a;->f2(Landroid/os/IBinder;)Lcom/google/android/gms/dynamic/b;

    move-result-object p1

    invoke-direct {v0, p1}, Lua/b;-><init>(Lcom/google/android/gms/dynamic/b;)V

    iput-object v0, p0, Lua/x;->a:Lua/b;

    return-void
.end method


# virtual methods
.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 3

    iget-object p2, p0, Lua/x;->a:Lua/b;

    invoke-static {p1}, Lea/c;->a(Landroid/os/Parcel;)I

    move-result v0

    invoke-virtual {p2}, Lua/b;->a()Lcom/google/android/gms/dynamic/b;

    move-result-object p2

    invoke-interface {p2}, Landroid/os/IInterface;->asBinder()Landroid/os/IBinder;

    move-result-object p2

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-static {p1, v2, p2, v1}, Lea/c;->t(Landroid/os/Parcel;ILandroid/os/IBinder;Z)V

    invoke-static {p1, v0}, Lea/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method
