.class public final Li4/m$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Li4/m;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field public static final a:Li4/m$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Li4/m$a;

    invoke-direct {v0}, Li4/m$a;-><init>()V

    sput-object v0, Li4/m$a;->a:Li4/m$a;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final a()Li4/m;
    .locals 1

    new-instance v0, Lcom/facebook/internal/d;

    invoke-direct {v0}, Lcom/facebook/internal/d;-><init>()V

    return-object v0
.end method
