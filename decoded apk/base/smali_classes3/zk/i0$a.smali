.class public final Lzk/i0$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgk/f$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lzk/i0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lgk/f$c<",
        "Lzk/i0;",
        ">;"
    }
.end annotation


# static fields
.field static final synthetic a:Lzk/i0$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lzk/i0$a;

    invoke-direct {v0}, Lzk/i0$a;-><init>()V

    sput-object v0, Lzk/i0$a;->a:Lzk/i0$a;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
