.class public final Lh0/d;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final c:Lh0/d;


# instance fields
.field private a:Landroid/util/Size;

.field private b:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lh0/d;

    invoke-direct {v0}, Lh0/d;-><init>()V

    sput-object v0, Lh0/d;->c:Lh0/d;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lh0/d;->a:Landroid/util/Size;

    const/4 v0, 0x0

    iput v0, p0, Lh0/d;->b:I

    return-void
.end method

.method public constructor <init>(Landroid/util/Size;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh0/d;->a:Landroid/util/Size;

    iput p2, p0, Lh0/d;->b:I

    return-void
.end method


# virtual methods
.method public a()Landroid/util/Size;
    .locals 1

    iget-object v0, p0, Lh0/d;->a:Landroid/util/Size;

    return-object v0
.end method

.method public b()I
    .locals 1

    iget v0, p0, Lh0/d;->b:I

    return v0
.end method
