.class public final enum Lqa/b;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lqa/b$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lqa/b;",
        ">;",
        "Landroid/os/Parcelable;"
    }
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lqa/b;",
            ">;"
        }
    .end annotation
.end field

.field public static final enum CROSS_PLATFORM:Lqa/b;

.field public static final enum PLATFORM:Lqa/b;

.field private static final synthetic zza:[Lqa/b;


# instance fields
.field private final zzb:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Lqa/b;

    const-string v1, "PLATFORM"

    const/4 v2, 0x0

    const-string v3, "platform"

    invoke-direct {v0, v1, v2, v3}, Lqa/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lqa/b;->PLATFORM:Lqa/b;

    new-instance v1, Lqa/b;

    const-string v3, "CROSS_PLATFORM"

    const/4 v4, 0x1

    const-string v5, "cross-platform"

    invoke-direct {v1, v3, v4, v5}, Lqa/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v1, Lqa/b;->CROSS_PLATFORM:Lqa/b;

    const/4 v3, 0x2

    new-array v3, v3, [Lqa/b;

    aput-object v0, v3, v2

    aput-object v1, v3, v4

    sput-object v3, Lqa/b;->zza:[Lqa/b;

    new-instance v0, Lqa/i0;

    invoke-direct {v0}, Lqa/i0;-><init>()V

    sput-object v0, Lqa/b;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lqa/b;->zzb:Ljava/lang/String;

    return-void
.end method

.method public static b(Ljava/lang/String;)Lqa/b;
    .locals 5

    invoke-static {}, Lqa/b;->values()[Lqa/b;

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    iget-object v4, v3, Lqa/b;->zzb:Ljava/lang/String;

    invoke-virtual {p0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    return-object v3

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    new-instance v0, Lqa/b$a;

    invoke-direct {v0, p0}, Lqa/b$a;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static valueOf(Ljava/lang/String;)Lqa/b;
    .locals 1

    const-class v0, Lqa/b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lqa/b;

    return-object p0
.end method

.method public static values()[Lqa/b;
    .locals 1

    sget-object v0, Lqa/b;->zza:[Lqa/b;

    invoke-virtual {v0}, [Lqa/b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lqa/b;

    return-object v0
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lqa/b;->zzb:Ljava/lang/String;

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    iget-object p2, p0, Lqa/b;->zzb:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    return-void
.end method
