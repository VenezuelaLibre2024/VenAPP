.class public final Lua/y;
.super Lea/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lua/y$a;
    }
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lua/y;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final a:F

.field private final b:I

.field private final c:I

.field private final d:Z

.field private final e:Lua/x;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lua/g0;

    invoke-direct {v0}, Lua/g0;-><init>()V

    sput-object v0, Lua/y;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(FIIZLua/x;)V
    .locals 0

    invoke-direct {p0}, Lea/a;-><init>()V

    iput p1, p0, Lua/y;->a:F

    iput p2, p0, Lua/y;->b:I

    iput p3, p0, Lua/y;->c:I

    iput-boolean p4, p0, Lua/y;->d:Z

    iput-object p5, p0, Lua/y;->e:Lua/x;

    return-void
.end method


# virtual methods
.method public u1()Lua/x;
    .locals 1

    iget-object v0, p0, Lua/y;->e:Lua/x;

    return-object v0
.end method

.method public v1()Z
    .locals 1

    iget-boolean v0, p0, Lua/y;->d:Z

    return v0
.end method

.method public final w1()F
    .locals 1

    iget v0, p0, Lua/y;->a:F

    return v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 4

    invoke-static {p1}, Lea/c;->a(Landroid/os/Parcel;)I

    move-result v0

    const/4 v1, 0x2

    iget v2, p0, Lua/y;->a:F

    invoke-static {p1, v1, v2}, Lea/c;->q(Landroid/os/Parcel;IF)V

    const/4 v1, 0x3

    iget v2, p0, Lua/y;->b:I

    invoke-static {p1, v1, v2}, Lea/c;->u(Landroid/os/Parcel;II)V

    const/4 v1, 0x4

    iget v2, p0, Lua/y;->c:I

    invoke-static {p1, v1, v2}, Lea/c;->u(Landroid/os/Parcel;II)V

    const/4 v1, 0x5

    invoke-virtual {p0}, Lua/y;->v1()Z

    move-result v2

    invoke-static {p1, v1, v2}, Lea/c;->g(Landroid/os/Parcel;IZ)V

    invoke-virtual {p0}, Lua/y;->u1()Lua/x;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x6

    invoke-static {p1, v3, v1, p2, v2}, Lea/c;->E(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    invoke-static {p1, v0}, Lea/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method

.method public final x1()Landroid/util/Pair;
    .locals 3

    iget v0, p0, Lua/y;->c:I

    iget v1, p0, Lua/y;->b:I

    new-instance v2, Landroid/util/Pair;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-direct {v2, v1, v0}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v2
.end method
