.class public final Lyl/l$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lyl/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lyl/l$a$a;
    }
.end annotation


# static fields
.field static final synthetic a:Lyl/l$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lyl/l$a;

    invoke-direct {v0}, Lyl/l$a;-><init>()V

    sput-object v0, Lyl/l$a;->a:Lyl/l$a;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
