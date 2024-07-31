.class public final enum Lqa/d0;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lqa/d0$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lqa/d0;",
        ">;",
        "Landroid/os/Parcelable;"
    }
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lqa/d0;",
            ">;"
        }
    .end annotation
.end field

.field public static final enum RESIDENT_KEY_DISCOURAGED:Lqa/d0;

.field public static final enum RESIDENT_KEY_PREFERRED:Lqa/d0;

.field public static final enum RESIDENT_KEY_REQUIRED:Lqa/d0;

.field private static final synthetic zza:[Lqa/d0;


# instance fields
.field private final zzb:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    new-instance v0, Lqa/d0;

    const-string v1, "RESIDENT_KEY_DISCOURAGED"

    const/4 v2, 0x0

    const-string v3, "discouraged"

    invoke-direct {v0, v1, v2, v3}, Lqa/d0;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lqa/d0;->RESIDENT_KEY_DISCOURAGED:Lqa/d0;

    new-instance v1, Lqa/d0;

    const-string v3, "RESIDENT_KEY_PREFERRED"

    const/4 v4, 0x1

    const-string v5, "preferred"

    invoke-direct {v1, v3, v4, v5}, Lqa/d0;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v1, Lqa/d0;->RESIDENT_KEY_PREFERRED:Lqa/d0;

    new-instance v3, Lqa/d0;

    const-string v5, "RESIDENT_KEY_REQUIRED"

    const/4 v6, 0x2

    const-string v7, "required"

    invoke-direct {v3, v5, v6, v7}, Lqa/d0;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v3, Lqa/d0;->RESIDENT_KEY_REQUIRED:Lqa/d0;

    const/4 v5, 0x3

    new-array v5, v5, [Lqa/d0;

    aput-object v0, v5, v2

    aput-object v1, v5, v4

    aput-object v3, v5, v6

    sput-object v5, Lqa/d0;->zza:[Lqa/d0;

    new-instance v0, Lqa/b1;

    invoke-direct {v0}, Lqa/b1;-><init>()V

    sput-object v0, Lqa/d0;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lqa/d0;->zzb:Ljava/lang/String;

    return-void
.end method

.method public static b(Ljava/lang/String;)Lqa/d0;
    .locals 5

    invoke-static {}, Lqa/d0;->values()[Lqa/d0;

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    iget-object v4, v3, Lqa/d0;->zzb:Ljava/lang/String;

    invoke-virtual {p0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    return-object v3

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    new-instance v0, Lqa/d0$a;

    invoke-direct {v0, p0}, Lqa/d0$a;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static valueOf(Ljava/lang/String;)Lqa/d0;
    .locals 1

    const-class v0, Lqa/d0;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lqa/d0;

    return-object p0
.end method

.method public static values()[Lqa/d0;
    .locals 1

    sget-object v0, Lqa/d0;->zza:[Lqa/d0;

    invoke-virtual {v0}, [Lqa/d0;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lqa/d0;

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

    iget-object v0, p0, Lqa/d0;->zzb:Ljava/lang/String;

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    iget-object p2, p0, Lqa/d0;->zzb:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    return-void
.end method
